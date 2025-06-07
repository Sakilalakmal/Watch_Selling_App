package com.example.watch_selling_app.presentation.viewModel

import androidx.lifecycle.ViewModel
import com.example.watch_selling_app.domain.model.ProductData
import com.example.watch_selling_app.domain.usecase.GetCasualWatchesUseCase
import com.example.watch_selling_app.domain.usecase.GetProductsUseCase
import com.google.android.gms.analytics.ecommerce.Product
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class ProductViewModel @Inject constructor(
    private val getProductsUseCase: GetProductsUseCase,
    private val getCasualWatchesUseCase: GetCasualWatchesUseCase
) : ViewModel() {

    private val _products = MutableStateFlow<List<ProductData>>(emptyList())
    val products: StateFlow<List<ProductData>> = _products

    private val _casualWatches = MutableStateFlow<List<ProductData>>(emptyList())
    val casualWatches: StateFlow<List<ProductData>> = _casualWatches

    init {
        loadProducts()
        loadCasualWatches()
    }

    private fun loadProducts() {
        _products.value = getProductsUseCase()
    }

    private fun loadCasualWatches() {
        _casualWatches.value = getCasualWatchesUseCase()
    }



    fun toggleFavorite(productId: Int) {
        _products.value = _products.value.map {
            if (it.id == productId) it.copy(isFavorite = !it.isFavorite) else it
        }
        _casualWatches.value = _casualWatches.value.map {
            if (it.id == productId) it.copy(isFavorite = !it.isFavorite) else it
        }
    }
}