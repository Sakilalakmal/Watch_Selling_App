package com.example.watch_selling_app.presentation.navigation

sealed class Screen(val route: String) {
    object Splash : Screen("splash")
    object Login : Screen("login")
    object Home : Screen("home")

    object ProductDetail : Screen("product_detail?productJson={productJson}") {
        fun passProduct(productJson: String): String {
            return "product_detail?productJson=$productJson"
        }
    }
}

