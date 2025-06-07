package com.example.watch_selling_app.presentation.viewModel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import com.example.watch_selling_app.domain.model.FavoriteItemData
import com.example.watch_selling_app.presentation.viewModel.state.FavoriteUiState

class FavoriteViewModel : ViewModel() {
    private val _state = MutableStateFlow(FavoriteUiState())
    val state: StateFlow<FavoriteUiState> = _state

    // Methods for add/remove will go here in future steps
}