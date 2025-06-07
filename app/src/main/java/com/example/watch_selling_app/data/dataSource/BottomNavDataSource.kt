package com.example.watch_selling_app.data.dataSource

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Storefront
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material.icons.outlined.Storefront
import androidx.compose.ui.res.stringResource
import com.example.watch_selling_app.R
import com.example.watch_selling_app.domain.model.BottomNavItem

object BottomNavDataSource {

    fun getBottomNavItems(): List<BottomNavItem> {
        return listOf(
            BottomNavItem(
                labelResId = R.string.home_navigation_icon,
                route = "home",
                filledIcon = Icons.Filled.Home,
                outlinedIcon = Icons.Outlined.Home,
                description = R.string.home_navigation_icon
            ),
            BottomNavItem(
                labelResId = R.string.favorite_navigation_icon,
                route = "favorite",
                filledIcon = Icons.Filled.Favorite,
                outlinedIcon = Icons.Outlined.Favorite,
                description =  R.string.favorite_navigation_icon
            ),
            BottomNavItem(
                labelResId = R.string.Store_navigation_icon,
                route = "watch_store",
                filledIcon = Icons.Filled.Storefront,
                outlinedIcon = Icons.Outlined.Storefront,
                description = R.string.Store_navigation_icon
            ),
            BottomNavItem(
                labelResId = R.string.shoppingCart_navigation_icon,
                route = "cart",
                filledIcon = Icons.Filled.ShoppingCart,
                outlinedIcon = Icons.Outlined.ShoppingCart,
                description = R.string.shoppingCart_navigation_icon
            ),
            BottomNavItem(
                labelResId = R.string.account_navigation_icon,
                route = "account",
                filledIcon = Icons.Filled.Person,
                outlinedIcon = Icons.Outlined.Person,
                description = R.string.account_navigation_icon
            )
        )
    }
}