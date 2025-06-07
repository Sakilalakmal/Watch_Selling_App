package com.example.watch_selling_app.domain.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class ProductDetailsScreenData(
    @DrawableRes  val checkoutButtonResId: Int,
    @StringRes val checkoutDescriptionResId: Int,
    @StringRes val titleDescriptionResId: Int,
)
