package com.example.watch_selling_app.domain.model

data class QuantitySelectorConfig (
    val minQuantity: Int = 1,
    val maxQuantity: Int = 99,
    val step: Int = 1,
    val showBorders: Boolean = true,
    val isEnabled: Boolean = true
)
