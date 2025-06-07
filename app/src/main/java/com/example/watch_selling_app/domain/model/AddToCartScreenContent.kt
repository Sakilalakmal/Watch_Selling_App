package com.example.watch_selling_app.domain.model

import androidx.annotation.DrawableRes

data class AddToCartScreenContent(
    val titleKey: String,
    val subtitleKey: String,
    @DrawableRes val proceedButtonKey: Int
)
