package com.example.watch_selling_app.presentation.components.product

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.IconButton
import androidx.compose.ui.graphics.Color
import com.example.watch_selling_app.ui.theme.LocalCustomColors

@Composable
fun FavoriteButton(
    modifier: Modifier,
    isFavorite: Boolean,
    onClick: () -> Unit
) {
    val isDarkTheme = isSystemInDarkTheme()

    val icon = if (isFavorite) Icons.Filled.Favorite else Icons.Outlined.FavoriteBorder

    val iconTint = when {
        isFavorite -> LocalCustomColors.current.luxuryGold
        isDarkTheme -> MaterialTheme.colorScheme.onBackground
        else -> Color.Black
    }

    IconButton(
        onClick = onClick,
        modifier = modifier
    ) {
        Icon(
            imageVector = icon,
            contentDescription = "Favorite",
            tint = iconTint
        )
    }
}

