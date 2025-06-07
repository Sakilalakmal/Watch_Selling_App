package com.example.watch_selling_app.presentation.screen.Home_Screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalOf
import com.example.watch_selling_app.data.dataSource.*
import com.example.watch_selling_app.domain.model.BottomNavItem
import com.example.watch_selling_app.domain.model.BrandData
import com.example.watch_selling_app.domain.model.ProductData
import com.example.watch_selling_app.presentation.components.BottomNavigationBar
import com.example.watch_selling_app.presentation.components.TopBarWithSearch
import com.example.watch_selling_app.presentation.components.brand.BrandListSection
import com.example.watch_selling_app.presentation.components.carouselSlider.Carousel
import com.example.watch_selling_app.presentation.components.product.CasualWatchSection
import com.example.watch_selling_app.presentation.components.product.ProductListSection
import com.example.watch_selling_app.ui.theme.Dimens
import com.example.watch_selling_app.utils.FavoritesManager

@Composable
fun HomeScreen(
    onProductClick: (ProductData) -> Unit,
    navItems: List<BottomNavItem>,
    selectedItem: BottomNavItem,
    onNavigateTo: (String) -> Unit
) {
    val topBarContent = DataSource.getTopBarContent()
    val searchBarContent = DataSource.getSearchBarContent()
    val carouselPartContent = CarouselDataSource.getCarouselItems()
    val products = ProductDataSource.getProducts()
    val casualWatches = CasualProductDataSource.getCasualWatches()
    val brands = BrandDataSource.getBrands()


    var selectedBrand by remember { mutableStateOf<BrandData?>(null) }

    var refreshTrigger by remember { mutableStateOf(0) }

    Scaffold(
        topBar = {
            TopBarWithSearch(
                topBarContent = topBarContent,
                searchBarContent = searchBarContent,
                onMessageClick = {},
                onNotificationClick = {}
            )
        },
        contentWindowInsets = WindowInsets(0, 0, 0, 0),
        bottomBar = {
            BottomNavigationBar(
                items = navItems,
                selectedItem = selectedItem,
                onItemSelected = { item ->
                    onNavigateTo(item.route)
                }
            )
        }
    ) { paddingValues ->
        val scrollState = rememberScrollState()

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .verticalScroll(scrollState)
        ) {

            Spacer(modifier = Modifier.height(Dimens.SpacingS))

            Carousel(items = carouselPartContent)

            BrandListSection(
                brands = brands,
                selectedBrand = selectedBrand,
                onBrandSelected = { brand ->
                    selectedBrand = brand
                },
                modifier = Modifier.padding(top = Dimens.SpacingM)
            )
            ProductListSection(
                products = products,
                onProductClick = { product ->
                    onProductClick(product)
                },
                onFavoriteClick = { product ->
                    FavoritesManager.toggleFavorite(product)
                    refreshTrigger++
                },
                refreshTrigger = refreshTrigger
            )

            CasualWatchSection(
                products = casualWatches,
                onProductClick = { product ->
                    onProductClick(product)
                },
                onFavoriteClick = { product ->
                    FavoritesManager.toggleFavorite(product)
                    refreshTrigger++
                }
            )

            Spacer(modifier = Modifier.height(Dimens.SpacingL))
        }
    }
}
