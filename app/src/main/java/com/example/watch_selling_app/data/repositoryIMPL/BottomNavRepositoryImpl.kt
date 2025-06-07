package com.example.watch_selling_app.data.repositoryIMPL

import com.example.watch_selling_app.data.dataSource.BottomNavDataSource
import com.example.watch_selling_app.domain.model.BottomNavItem
import com.example.watch_selling_app.domain.repository.BottomNavRepository

class BottomNavRepositoryImpl : BottomNavRepository {
    override fun getBottomNavItems(): List<BottomNavItem> {
        return BottomNavDataSource.getBottomNavItems()
    }
}