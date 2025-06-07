package com.example.watch_selling_app.domain.model

// state data for login screen

data class LoginFormData(
    var email: String = "",
    var password: String = "",
    var rememberMe: Boolean = false,
    val emailError: String? = null,
    val passwordError: String? = null
)