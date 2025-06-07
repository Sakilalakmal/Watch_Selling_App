package com.example.watch_selling_app.data.dataSource


object AuthDataSource {

        private var savedEmail: String? = "user@example.com"
        private var rememberMe: Boolean = true

        fun getSavedEmail(): String? {
            return if (rememberMe) savedEmail else null
        }

        fun isRememberMeEnabled(): Boolean {
            return rememberMe
        }

        fun clearSavedEmail() {
            savedEmail = null
            rememberMe = false
        }
}
