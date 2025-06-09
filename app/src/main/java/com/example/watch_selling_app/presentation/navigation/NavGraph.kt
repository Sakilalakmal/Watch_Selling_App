// NavGraph.kt (Simple version)
package com.example.watch_selling_app.presentation.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.runtime.*
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.watch_selling_app.data.dataSource.BottomNavDataSource
import com.example.watch_selling_app.presentation.screen.Account_Screen.AccountScreen
import com.example.watch_selling_app.presentation.screen.Cart_Screen.CartScreen
import com.example.watch_selling_app.presentation.screen.Favorite_Screen.FavoriteScreen
import com.example.watch_selling_app.presentation.screen.Home_Screen.HomeScreen
import com.example.watch_selling_app.presentation.screen.Login_Screen.LoginScreen
import com.example.watch_selling_app.presentation.screen.ProductDetailScreen.ProductDetailScreen
import com.example.watch_selling_app.presentation.screen.Register_Screen.RegisterScreenContent
import com.example.watch_selling_app.presentation.screen.Splash_Screen.SplashScreen
import com.example.watch_selling_app.presentation.screen.watchStore_Screen.WatchStoreScreen
import com.example.watch_selling_app.utils.ProductHolder
import com.example.watch_selling_app.domain.model.RegisterFormData
import com.example.watch_selling_app.data.dataSource.DataSource
import com.google.accompanist.navigation.animation.AnimatedNavHost

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun AppNavGraph(navController: NavHostController,
               ) {
    val navItems = BottomNavDataSource.getBottomNavItems()
    var selectedItem by remember { mutableStateOf(navItems.first()) }

    AnimatedNavHost(
        navController = navController,
        startDestination = "splash",

    )  {
        composable("splash") {
            SplashScreen(
                onGetStartedClick = {
                    navController.navigate("login") {
                        popUpTo("splash") { inclusive = true }
                    }
                }
            )
        }

        composable("login") {
            LoginScreen(
                onLoginSuccess = {
                    navController.navigate("home") {
                        popUpTo("login") { inclusive = true }
                    }
                },
                onRegisterClick = {
                    navController.navigate("register")
                }
            )
        }

        composable("register") {
            val registerFormData = remember { mutableStateOf(RegisterFormData()) }.value

            RegisterScreenContent(
                onBackClick = { navController.popBackStack() },
                onLoginHereClick = {
                    navController.popBackStack()
                },
                onExploreClick = {
                    navController.navigate("home") {
                        popUpTo("register") { inclusive = true }
                    }
                },
                onRegisterClick = {},
                formData = registerFormData,
                content = DataSource.getRegisterContent(),
                formText = DataSource.getRegisterFormTextContent(),
                onEmailChanged = { registerFormData.email = it },
                onPasswordChanged = { registerFormData.password = it },
                onNameChanged = { registerFormData.name = it },
                onConfirmPasswordChanged = { registerFormData.confirmPassword = it },
                onMobileChanged = { registerFormData.mobile = it }
            )
        }

        composable("home") {
            HomeScreen(
                onProductClick = { product ->
                    ProductHolder.selectedProduct = product
                    navController.navigate("product_detail")
                },
                onNavigateTo = { route ->
                    selectedItem = navItems.first { it.route == route }
                    navController.navigate(route) {
                        popUpTo("home") { inclusive = false }
                        launchSingleTop = true
                    }
                },
                selectedItem = selectedItem,
                navItems = navItems,
            )
        }

        composable("favorite") {
            FavoriteScreen(
                navItems = navItems,
                selectedItem = selectedItem,
                onItemSelected = { item ->
                    selectedItem = item
                    navController.navigate(item.route) {
                        popUpTo("home") { inclusive = false }
                        launchSingleTop = true
                    }
                },
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }

        composable("watch_store") {
            WatchStoreScreen(
                navItems = navItems,
                selectedItem = selectedItem,
                onItemSelected = { item ->
                    selectedItem = item
                    navController.navigate(item.route) {
                        popUpTo("home") { inclusive = false }
                        launchSingleTop = true
                    }
                },
                onBackClick = { navController.popBackStack() },
                onProductClick = { product ->
                    ProductHolder.selectedProduct = product
                    navController.navigate("product_detail")
                }
            )
        }

        composable("account") {
            AccountScreen(
                navItems = navItems,
                selectedItem = selectedItem,
                onItemSelected = { item ->
                    selectedItem = item
                    navController.navigate(item.route) {
                        popUpTo("home") { inclusive = false }
                        launchSingleTop = true
                    }
                },
                onBackClick = {
                    navController.popBackStack()
                },
                onLogoutClick = {  navController.navigate("login") {
                    popUpTo("home") { inclusive = true }
                    launchSingleTop = true
                }}
            )
        }

        composable("product_detail",     enterTransition = { slideInHorizontally(initialOffsetX = { 900 }) + fadeIn() },
            exitTransition = { slideOutHorizontally(targetOffsetX = { -900 }) + fadeOut() },
            popEnterTransition = { slideInHorizontally(initialOffsetX = { -900 }) + fadeIn() },
            popExitTransition = { slideOutHorizontally(targetOffsetX = { 900 }) + fadeOut() }) {
            ProductDetailScreen(
                onBackClick = { navController.popBackStack() },
                onCheckoutClick = {
                    navController.navigate("cart")
                }
            )
        }

        composable("cart") {
            CartScreen(
                onBackClick = { navController.popBackStack() },
                onProceedClick = {
                    // Future: Add payment or confirmation screen
                }
            )
        }
    }
}
