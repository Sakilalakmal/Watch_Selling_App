package com.example.watch_selling_app.domain.model

import androidx.compose.ui.graphics.vector.ImageVector

data class RegisterContent(
    val backgroundImageResId: Int,
    val backgroundImageDescriptionKey: String,

    val backButtonIconDescriptionKey: String,

    val titleKey: String,
    val subtitleKey: String,

    val exploreButtonLightResId: Int,
    val exploreButtonDarkResId: Int,
    val exploreButtonDescriptionKey: String,

    val alreadyHaveAccountKey: String,
    val loginHereKey: String
)
