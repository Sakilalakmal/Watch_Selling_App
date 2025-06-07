package com.example.watch_selling_app.presentation.components.Account

import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import com.example.ui.theme.AppTypography
import com.example.watch_selling_app.domain.model.AccountSectionEntry
import com.example.watch_selling_app.presentation.screen.Login_Screen.getSafeString
import com.example.watch_selling_app.ui.theme.Dimens
import com.example.watch_selling_app.ui.theme.LocalCustomColors

@Composable
fun SectionCard(
    item: AccountSectionEntry,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
) {
    val context = LocalContext.current

    //dark variable
    val isDark = isSystemInDarkTheme()
    val title = getSafeString(context.resources.getResourceEntryName(item.titleResId))
    val description = getSafeString(context.resources.getResourceEntryName(item.descriptionResId))

    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = Dimens.SpacingM, vertical = Dimens.SpacingS)
            .clickable { onClick() },
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = item.iconLightResId,
            contentDescription = title,
            tint = if (isDark) LocalCustomColors.current.luxuryGold else MaterialTheme.colorScheme.onBackground,
            modifier = Modifier
                .size(Dimens.iconButtonSize)
                .padding(end = Dimens.SpacingM)
        )

        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = title,
                style = AppTypography.titleMedium,
                color = MaterialTheme.colorScheme.onSurface
            )

        }
    }
}
