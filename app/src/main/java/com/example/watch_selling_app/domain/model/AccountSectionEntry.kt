package com.example.watch_selling_app.domain.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.ui.graphics.vector.ImageVector

data class AccountSectionEntry(
    @StringRes val titleResId: Int,
    val iconLightResId: ImageVector,
    @StringRes val descriptionResId: Int
)
