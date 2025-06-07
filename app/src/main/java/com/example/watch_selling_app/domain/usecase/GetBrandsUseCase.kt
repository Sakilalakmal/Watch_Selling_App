package com.example.watch_selling_app.domain.usecase


import com.example.watch_selling_app.domain.model.BrandData
import com.example.watch_selling_app.domain.repository.BrandRepository
import javax.inject.Inject

class GetBrandsUseCase @Inject constructor  (private val repository: BrandRepository) {
    operator fun invoke(): List<BrandData> = repository.getBrands()
}
