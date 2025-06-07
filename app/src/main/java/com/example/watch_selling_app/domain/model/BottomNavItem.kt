package com.example.watch_selling_app.domain.model

import androidx.annotation.StringRes
import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavItem(
    @StringRes val labelResId: Int,
    val route: String,
    val filledIcon: ImageVector,
    val outlinedIcon: ImageVector,
    @StringRes val description: Int? = null
)
