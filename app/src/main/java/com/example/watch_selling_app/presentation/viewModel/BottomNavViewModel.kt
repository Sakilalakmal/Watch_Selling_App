package com.example.watch_selling_app.presentation.viewModel

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.example.watch_selling_app.data.dataSource.BottomNavDataSource
import com.example.watch_selling_app.domain.model.BottomNavItem
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class BottomNavViewModel @Inject constructor() : ViewModel() {

    private val navItems = BottomNavDataSource.getBottomNavItems()

    var selectedItem by mutableStateOf(navItems.first())
        private set

    fun onItemSelected(item: BottomNavItem) {
        selectedItem = item
    }

    fun getNavItems(): List<BottomNavItem> = navItems
}