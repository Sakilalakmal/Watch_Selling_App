package com.example.watch_selling_app.data.repositoryIMPL

import com.example.watch_selling_app.data.dataSource.BrandDataSource
import com.example.watch_selling_app.domain.model.BrandData
import com.example.watch_selling_app.domain.repository.BrandRepository
import javax.inject.Inject

class BrandRepositoryImpl @Inject constructor() : BrandRepository {
    override fun getBrands(): List<BrandData> {
        return BrandDataSource.getBrands()
    }
}