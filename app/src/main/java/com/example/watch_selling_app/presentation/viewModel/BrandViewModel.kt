package com.example.watch_selling_app.presentation.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.watch_selling_app.domain.model.BrandData
import com.example.watch_selling_app.domain.usecase.GetBrandsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class BrandViewModel @Inject constructor(
    private val getBrandsUseCase: GetBrandsUseCase
) : ViewModel() {

    private val _brands = MutableStateFlow<List<BrandData>>(emptyList())
    val brands: StateFlow<List<BrandData>> = _brands

    private val _selectedBrand = MutableStateFlow<BrandData?>(null)
    val selectedBrand: StateFlow<BrandData?> = _selectedBrand

    init {
        loadBrands()
    }

    private fun loadBrands() {
        viewModelScope.launch {
            _brands.value = getBrandsUseCase()
        }
    }

    fun selectBrand(brand: BrandData) {
        _selectedBrand.value = brand
    }
}