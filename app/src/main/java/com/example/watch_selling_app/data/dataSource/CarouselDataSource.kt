package com.example.watch_selling_app.data.dataSource

import androidx.compose.ui.res.stringResource
import com.example.watch_selling_app.R
import com.example.watch_selling_app.domain.model.CarouselItem

object CarouselDataSource {
    fun getCarouselItems(): List<CarouselItem> = listOf(
        CarouselItem(R.drawable.c_1, "carousel_1"),
        CarouselItem(R.drawable.c_2, "carousel_1"),
        CarouselItem(R.drawable.c_3, "carousel_1"),
        CarouselItem(R.drawable.c_4, "carousel_1")
    )
}