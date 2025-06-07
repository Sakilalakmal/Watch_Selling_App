package com.example.watch_selling_app.presentation.components.brand

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.watch_selling_app.domain.model.BrandData
import com.example.watch_selling_app.presentation.screen.Login_Screen.getSafeString
import com.example.watch_selling_app.ui.theme.Dimens
import com.example.watch_selling_app.ui.theme.LocalCustomColors

@Composable
fun BrandItem(
    brand: BrandData,
    isSelected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val isDarkTheme = isSystemInDarkTheme()

    // Background logic
    val backgroundColor = when {
        isSelected && !isDarkTheme -> Color.Black
        isSelected && isDarkTheme -> MaterialTheme.colorScheme.surfaceContainer
        else -> MaterialTheme.colorScheme.surfaceVariant
    }

    // Border logic
    val borderColor = when {
        isSelected && isDarkTheme -> LocalCustomColors.current.luxuryGold
        isSelected -> Color.White
        else -> Color.Transparent
    }

    // Tint logic: Only tint if selected
    val iconTint = when {
        isSelected && isDarkTheme -> LocalCustomColors.current.luxuryGold
        isSelected && !isDarkTheme -> Color.White
        else -> null // No tint for unselected
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Box(
            modifier = Modifier
                .clip(CircleShape)
                .background(backgroundColor)
                .border(Dimens.border_width_medium, borderColor, CircleShape)
                .clickable(onClick = onClick)
                .padding(Dimens.SpacingM)
                .size(Dimens.brand_size),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = brand.logoResId),
                contentDescription = getSafeString(brand.logoDescriptionResId.toString()),
                modifier = Modifier.size(Dimens.brand_logo_size),
                contentScale = ContentScale.Fit,
                colorFilter = if (isSelected && iconTint != null) {
                    ColorFilter.tint(iconTint)
                } else {
                    null
                }

            )
        }

        Text(
            text = getSafeString(brand.nameResId.toString()),
            style = MaterialTheme.typography.titleMedium,
            modifier = Modifier.padding(top = Dimens.SpacingXXS),
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )
    }
}

