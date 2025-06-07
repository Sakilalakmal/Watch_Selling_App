package com.example.watch_selling_app.domain.model

import androidx.compose.ui.graphics.vector.ImageVector

data class LoginFormTextContent(
    val emailLabelKey: String,
    val emailPlaceholderKey: String,
    val passwordLabelKey: String,
    val passwordPlaceholderKey: String,
    val rememberMeKey: String,
    val forgotPasswordKey: String,
    val leadingIconMailResId: ImageVector,
    val leadingIconPassResId: ImageVector
)
