package com.example.watch_selling_app.domain.usecase

import com.example.watch_selling_app.domain.model.ProductData
import com.example.watch_selling_app.domain.repository.ProductRepository
import javax.inject.Inject


    class GetCasualWatchesUseCase @Inject constructor(
        private val repository: ProductRepository
    ) {
        operator fun invoke(): List<ProductData> = repository.getCasualWatches()
    }
