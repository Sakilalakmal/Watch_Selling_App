package com.example.watch_selling_app.domain.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class ProductData(
    val id: Int,
    @StringRes val brandNameResId: Int,
    @StringRes val brandImageDesc : Int,
    @StringRes val modelNameResId: Int,
    val price: Int,
    @DrawableRes val imageResId: Int,
    val isFavorite: Boolean = false,
    @StringRes val watchDesc : Int,
    val rating: Float,
    val quantity: Int = 1
)
