package com.example.watch_selling_app.domain.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.watch_selling_app.R

data class FavoriteItemData(
    val id: Int,
    @DrawableRes val imageResId: Int,
    @StringRes val modelNameResId: Int,
    val price: Int
)
