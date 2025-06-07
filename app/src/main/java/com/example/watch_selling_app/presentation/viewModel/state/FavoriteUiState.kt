package com.example.watch_selling_app.presentation.viewModel.state

import com.example.watch_selling_app.domain.model.FavoriteItemData

data class FavoriteUiState(
    val favoriteItems: List<FavoriteItemData> = emptyList()
)
