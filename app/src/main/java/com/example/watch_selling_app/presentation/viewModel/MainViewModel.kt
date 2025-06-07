package com.example.watch_selling_app.presentation.viewModel

import androidx.lifecycle.ViewModel
import com.example.watch_selling_app.data.dataSource.BottomNavDataSource
import com.example.watch_selling_app.domain.model.BottomNavItem
import com.example.watch_selling_app.domain.model.NavigationItem
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor() : ViewModel() {
    private val _selectedItem = MutableStateFlow(BottomNavDataSource.getBottomNavItems().first())
    val selectedItem: StateFlow<BottomNavItem> = _selectedItem

    fun onNavigationItemSelected(item: BottomNavItem) {
        _selectedItem.value = item
    }
}