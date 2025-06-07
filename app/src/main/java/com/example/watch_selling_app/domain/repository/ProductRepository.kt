package com.example.watch_selling_app.domain.repository

import com.example.watch_selling_app.domain.model.ProductData

interface ProductRepository  {
    fun getProducts(): List<ProductData>
    fun getCasualWatches(): List<ProductData>
}
