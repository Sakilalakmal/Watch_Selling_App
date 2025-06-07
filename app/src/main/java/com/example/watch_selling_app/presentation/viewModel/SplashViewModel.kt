package com.example.watch_selling_app.presentation.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.watch_selling_app.domain.model.SplashContent
import com.example.watch_selling_app.domain.repository.SplashRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(
    private val repository: SplashRepository
) : ViewModel() {

    private val _splashContent = MutableStateFlow<SplashContent?>(null)
    val splashContent: StateFlow<SplashContent?> = _splashContent

    init {
        loadSplashContent()
    }

    private fun loadSplashContent() {
        viewModelScope.launch {
            _splashContent.value = repository.getSplashContent()
        }
    }
}