package com.example.watch_selling_app.presentation.components.carouselSlider

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.watch_selling_app.data.dataSource.CarouselDataSource
import com.example.watch_selling_app.domain.model.CarouselItem
import com.example.watch_selling_app.ui.theme.Dimens
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState

@Composable
fun Carousel(
    items: List<CarouselItem>,
    modifier: Modifier = Modifier,
    autoScrollDelay: Long = 3000L
) {
    val pagerState = rememberPagerState(initialPage = 0)
    val scope = rememberCoroutineScope()

    LaunchedEffect(pagerState.currentPage) {
        delay(autoScrollDelay)
        val nextPage = (pagerState.currentPage + 1) % items.size
        scope.launch {
            pagerState.animateScrollToPage(nextPage)
        }
    }

    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = modifier) {
        Box(
            modifier = Modifier
                .padding(top = Dimens.SpacingM)
                .fillMaxWidth()
                .height(180.dp)
        ) {
            HorizontalPager(
                count = items.size,
                state = pagerState,
                modifier = Modifier.fillMaxSize()
            ) { index ->
                CarouselCard(item = items[index])
            }

            CarouselArrowButtons(
                pagerState = pagerState,
                itemCount = items.size,
                scope = scope
            )
        }

        PageIndicator(
            pageCount = items.size,
            currentPage = pagerState.currentPage,
            modifier = Modifier.padding(top = 8.dp)
        )
    }
}



