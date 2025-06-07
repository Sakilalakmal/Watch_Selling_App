
package com.example.watch_selling_app.presentation.components


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CameraAlt
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.watch_selling_app.R
import com.example.watch_selling_app.domain.model.SearchBarContent
import com.example.watch_selling_app.presentation.screen.Login_Screen.getSafeString
import com.example.watch_selling_app.ui.theme.Dimens

@Composable
fun SearchBar(
    content: SearchBarContent,
    modifier: Modifier = Modifier
) {

    val context = LocalContext.current
    val placeholderText = remember(content.placeholderKey) {
        val resId = context.resources.getIdentifier(content.placeholderKey, "string", context.packageName)
        if (resId != 0) context.getString(resId) else ""
    }


    TextField(
        value = "", // static and empty
        onValueChange = {}, // no interaction allowed
        placeholder = { Text(text = getSafeString(placeholderText)) },
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = stringResource(id = R.string.serach_icon_desc)
            )
        },
        trailingIcon = {
            Icon(
                imageVector = Icons.Default.CameraAlt,
                contentDescription = stringResource(id = R.string.camera_icon_desc)
            )
        },
        shape = RoundedCornerShape(Dimens.SpacingM),
        singleLine = true,
        enabled = false, // makes it visually static
        colors = OutlinedTextFieldDefaults.colors(
            disabledTextColor = MaterialTheme.colorScheme.onSurface,
            disabledTrailingIconColor = MaterialTheme.colorScheme.onSurfaceVariant,
            disabledLeadingIconColor = MaterialTheme.colorScheme.onSurfaceVariant,
            disabledContainerColor = MaterialTheme.colorScheme.surfaceContainer,
            disabledPlaceholderColor = MaterialTheme.colorScheme.onSurfaceVariant,
            disabledLabelColor = MaterialTheme.colorScheme.onSurfaceVariant,
            disabledBorderColor = MaterialTheme.colorScheme.outline,
        ),
        modifier = modifier
            .fillMaxWidth()
            .height(Dimens.maximumS)
    )
}

