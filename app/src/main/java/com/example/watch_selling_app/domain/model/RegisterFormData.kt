package com.example.watch_selling_app.domain.model

data class RegisterFormData(
    var name: String = "",
    var email: String = "",
    var password: String = "",
    var confirmPassword: String = "",
    var mobile: String = ""

)

