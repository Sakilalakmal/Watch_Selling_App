package com.example.watch_selling_app.presentation.components.carouselSlider

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.watch_selling_app.ui.theme.LocalCustomColors

@Composable
fun PageIndicator(
    pageCount: Int,
    currentPage: Int,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.padding(top = 8.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        repeat(pageCount) { index ->
            IndicatorDot(
                isSelected = index == currentPage,
                modifier = Modifier.padding(horizontal = 4.dp)
            )
        }
    }
}

@Composable
fun IndicatorDot(
    isSelected: Boolean,
    modifier: Modifier = Modifier
) {
    val size = animateDpAsState(targetValue = if (isSelected) 12.dp else 8.dp, label = "")
    val color = if (isSelected) LocalCustomColors.current.luxuryGold else MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.3f)

    Box(
        modifier = modifier
            .size(size.value)
            .clip(CircleShape)
            .background(color)
    )
}
