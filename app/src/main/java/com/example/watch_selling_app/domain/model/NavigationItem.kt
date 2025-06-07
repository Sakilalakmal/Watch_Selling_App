package com.example.watch_selling_app.domain.model


    sealed class NavigationItem(val route: String) {
    object Home : NavigationItem("home")
    object Favorite : NavigationItem("favorite")
    object Brands : NavigationItem("brands")
    object Cart : NavigationItem("cart")
    object Account : NavigationItem("account")
}

