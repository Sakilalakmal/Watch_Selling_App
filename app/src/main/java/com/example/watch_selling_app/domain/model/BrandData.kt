package com.example.watch_selling_app.domain.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class BrandData(
    val id: Int,
    @StringRes val nameResId: Int,
    @StringRes val logoDescriptionResId: Int,
    @DrawableRes val logoResId: Int,
    val isSelected: Boolean = false
)
