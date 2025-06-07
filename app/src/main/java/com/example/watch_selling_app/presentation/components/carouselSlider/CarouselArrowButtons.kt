package com.example.watch_selling_app.presentation.components.carouselSlider

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.watch_selling_app.ui.theme.Dimens
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun CarouselArrowButtons(
    pagerState: com.google.accompanist.pager.PagerState,
    itemCount: Int,
    scope: CoroutineScope,
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier.fillMaxSize()) {
        IconButton(
            onClick = {
                val prev = pagerState.currentPage - 1
                if (prev >= 0) scope.launch { pagerState.scrollToPage(prev) }
            },
            modifier = Modifier
                .align(Alignment.CenterStart)
                .padding(horizontal = Dimens.SpacingL)
                .size(36.dp)
                .clip(CircleShape)
                .background(MaterialTheme.colorScheme.surface.copy(alpha = 0.3f)),
        ) {
            Icon(
                imageVector = Icons.Default.KeyboardArrowLeft,
                contentDescription = "Previous",
                tint = MaterialTheme.colorScheme.onSurface
            )
        }

        IconButton(
            onClick = {
                val next = pagerState.currentPage + 1
                if (next < itemCount) scope.launch { pagerState.scrollToPage(next) }
            },
            modifier = Modifier
                .align(Alignment.CenterEnd)
                .padding(horizontal = Dimens.SpacingL)
                .size(36.dp)
                .clip(CircleShape)
                .background(MaterialTheme.colorScheme.surface.copy(alpha = 0.3f)),
        ) {
            Icon(
                imageVector = Icons.Default.KeyboardArrowRight,
                contentDescription = "Next",
                tint = MaterialTheme.colorScheme.onSurface
            )
        }
    }
}




