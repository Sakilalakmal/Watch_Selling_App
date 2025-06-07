package com.example.watch_selling_app.domain.repository

import com.example.watch_selling_app.domain.model.BottomNavItem

interface BottomNavRepository {
    fun getBottomNavItems(): List<BottomNavItem>
}