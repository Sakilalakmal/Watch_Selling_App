package com.example.watch_selling_app.domain.model

import androidx.compose.ui.graphics.vector.ImageVector

data class RegisterFormTextContent(
    val fullNameLabelKey: String,
    val fullNamePlaceholderKey: String,

    val emailLabelKey: String,
    val emailPlaceholderKey: String,

    val mobileLabelKey: String,
    val mobilePlaceholderKey: String,

    val passwordLabelKey: String,
    val passwordPlaceholderKey: String,

    val confirmPasswordLabelKey: String,
    val confirmPasswordPlaceholderKey: String,

    //leading icons
    val nameLeadingIcon : ImageVector,
    val emailLeadingIcon : ImageVector,
    val mobileLeadingIcon : ImageVector,
    val passwordLeadingIcon : ImageVector,
    val confirmPasswordLeadingIcon : ImageVector

)
