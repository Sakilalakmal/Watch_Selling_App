package com.example.watch_selling_app.data.dataSource

import com.example.watch_selling_app.domain.model.CartItemData

object CartDataSource {

    fun getMockCartItems(): List<CartItemData> {
        val products = ProductDataSource.getProducts()

        return listOf(
            CartItemData(product = products[0], quantity = 1),
            CartItemData(product = products[1], quantity = 2)
        )
    }
}