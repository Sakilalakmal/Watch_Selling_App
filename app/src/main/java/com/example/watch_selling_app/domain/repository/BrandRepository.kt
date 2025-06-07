package com.example.watch_selling_app.domain.repository

import com.example.watch_selling_app.domain.model.BrandData

interface BrandRepository {
    fun getBrands(): List<BrandData>
}
