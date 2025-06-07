package com.example.watch_selling_app.utils

import com.example.watch_selling_app.domain.model.ProductData

object FavoritesManager {
    private val favoriteProducts = mutableListOf<ProductData>()

    fun addFavorite(product: ProductData) {
        if (!favoriteProducts.any { it.id == product.id }) {
            favoriteProducts.add(product)
        }
    }

    fun removeFavorite(product: ProductData) {
        favoriteProducts.removeAll { it.id == product.id }
    }

    fun isFavorite(product: ProductData): Boolean {
        return favoriteProducts.any { it.id == product.id }
    }

    fun getFavorites(): List<ProductData> {
        return favoriteProducts.toList()
    }

    fun toggleFavorite(product: ProductData) {
        if (isFavorite(product)) {
            removeFavorite(product)
        } else {
            addFavorite(product)
        }
    }
}
