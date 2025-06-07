package com.example.watch_selling_app.domain.model

import androidx.compose.ui.graphics.vector.ImageVector

data class TopBarContent(
    val backgroundImageResId: Int,
    val backgroundDesc : String,
    val notificationIcon: ImageVector,
    val notificationIconDescriptionKey: String,
    val messageIcon: ImageVector,
    val messageIconDescriptionKey: String
)
