package com.example.watch_selling_app.utils

import androidx.compose.runtime.mutableStateListOf
import com.example.watch_selling_app.domain.model.CartItemData
import com.example.watch_selling_app.domain.model.ProductData

object CartManager {

    private val _cartItems = mutableStateListOf<CartItemData>()
    val cartItems: List<CartItemData> get() = _cartItems

    fun addToCart(product: ProductData, quantity: Int = 1) {
        val existingItem = _cartItems.find { it.product == product }
        if (existingItem != null) {
            existingItem.quantity += quantity
        } else {
            _cartItems.add(CartItemData(product, quantity))
        }
    }

    fun removeFromCart(product: ProductData) {
        _cartItems.removeAll { it.product == product }
    }

    fun updateQuantity(product: ProductData, newQuantity: Int) {
        val item = _cartItems.find { it.product == product }
        if (item != null && newQuantity > 0) {
            item.quantity = newQuantity
        } else {
            removeFromCart(product)
        }
    }

    fun getTotalPrice(): Int {
        return _cartItems.sumOf { it.product.price * it.quantity }
    }

    fun clearCart() {
        _cartItems.clear()
    }

    fun isInCart(product: ProductData): Boolean {
        return _cartItems.any { it.product == product }
    }
}