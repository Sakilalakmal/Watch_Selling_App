package com.example.watch_selling_app.presentation.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.StarHalf
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.StarHalf
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.watch_selling_app.ui.theme.Dimens
import com.example.watch_selling_app.ui.theme.LocalCustomColors

@Composable
fun RatingBar(
    rating: Float,
    modifier: Modifier = Modifier,
    totalStars: Int = 5
) {
    Row(modifier = modifier) {
        for (i in 1..totalStars) {
            val icon = when {
                i <= rating -> Icons.Filled.Star
                i - rating < 1 -> Icons.Filled.StarHalf
                else -> Icons.Outlined.Star
            }

            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = LocalCustomColors.current.luxuryGold, // Gold color
                modifier = Modifier.size(Dimens.ratingStarSize)
            )
        }
    }
}
