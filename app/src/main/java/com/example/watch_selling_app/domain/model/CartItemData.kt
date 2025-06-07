package com.example.watch_selling_app.domain.model

data class CartItemData(
    val product: ProductData,
    var quantity: Int = 1
)
