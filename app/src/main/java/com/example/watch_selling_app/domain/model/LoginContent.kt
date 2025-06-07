package com.example.watch_selling_app.domain.model

import androidx.compose.ui.graphics.vector.ImageVector

// data for that used in login screen

data class LoginContent(
    val backgroundImageResId: Int,
    val backgroundImageDescriptionKey: String,
    val illustrationImageResId: Int,
    val illustrationImageDescriptionKey: String,
    val backButtonIcon: ImageVector,
    val backButtonIconDescriptionKey: String,

    val titleKey: String,
    val subtitleKey: String,

    val loginButtonLightResId: Int,
    val loginButtonDarkResId: Int,
    val loginButtonDescriptionKey: String,

    val registerPromptKey: String,
    val registerActionTextKey: String,

    val googleButtonLightResId: Int,
    val googleButtonDarkResId: Int,
    val googleButtonDescriptionKey: String,

    val emailButtonLightResId: Int,
    val emailButtonDarkResId: Int,
    val emailButtonDescriptionKey: String,


)
