package com.example.watch_selling_app.data.repositoryIMPL

import com.example.watch_selling_app.data.dataSource.CasualProductDataSource
import com.example.watch_selling_app.data.dataSource.ProductDataSource
import com.example.watch_selling_app.domain.model.ProductData
import com.example.watch_selling_app.domain.repository.ProductRepository
import javax.inject.Inject

class ProductRepositoryImpl @Inject constructor() : ProductRepository {
    override fun getProducts(): List<ProductData> {
        return ProductDataSource.getProducts()
    }

    override fun getCasualWatches(): List<ProductData> {
        return CasualProductDataSource.getCasualWatches()
    }
}



