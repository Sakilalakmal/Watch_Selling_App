package com.example.watch_selling_app.presentation.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import com.example.watch_selling_app.ui.theme.Dimens

@Composable
fun BackIconButton(
    descriptionKey: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    val description = context.resources.getIdentifier(descriptionKey, "string", context.packageName)
        .takeIf { it != 0 }
        ?.let { stringResource(id = it) }
        ?: ""
    val isLight = isSystemInDarkTheme()
    val backgroundColor = if (isLight) MaterialTheme.colorScheme.onSecondary else MaterialTheme.colorScheme.background
    val iconColor = if (isLight) MaterialTheme.colorScheme.onBackground else MaterialTheme.colorScheme.onBackground

    Box(
        modifier = modifier
            .padding(top = Dimens.SpacingXL, end = Dimens.SpacingS)
            .size(Dimens.iconButtonSize)
            .clip(CircleShape)
            .background(backgroundColor)
            .clickable { onClick() },
        contentAlignment = Alignment.Center
    ) {
        Icon(
            imageVector = Icons.Filled.ArrowBackIosNew,
            contentDescription = description,
            tint = iconColor
        )
    }
}



