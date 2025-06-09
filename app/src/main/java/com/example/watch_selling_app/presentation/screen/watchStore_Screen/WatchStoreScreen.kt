package com.example.watch_selling_app.presentation.screen.watchStore_Screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.watch_selling_app.data.dataSource.*
import com.example.watch_selling_app.domain.model.BottomNavItem
import com.example.watch_selling_app.domain.model.BrandData
import com.example.watch_selling_app.presentation.components.BackIconButton
import com.example.watch_selling_app.presentation.components.BottomNavigationBar
import com.example.watch_selling_app.presentation.components.brand.BrandListSection
import com.example.watch_selling_app.presentation.components.product.ProductCard
import com.example.watch_selling_app.ui.theme.Dimens
import com.example.watch_selling_app.utils.FavoritesManager
import com.example.watch_selling_app.domain.model.ProductData

@Composable
fun WatchStoreScreen(
    navItems: List<BottomNavItem>,
    selectedItem: BottomNavItem,
    onItemSelected: (BottomNavItem) -> Unit,
    onBackClick: () -> Unit,
    onProductClick: (ProductData) -> Unit
) {
    val screenContent = WatchStoreScreenContentDataSource.getContent()
    val allProducts = StoreProductDataSource.getStoreProducts()
    val brands = BrandDataSource.getBrands()

    var selectedBrand by remember { mutableStateOf<BrandData?>(null) }

    val filteredProducts = if (selectedBrand == null) allProducts else allProducts.filter {
        it.brandNameResId == selectedBrand!!.nameResId
    }

    Scaffold(
        contentWindowInsets = WindowInsets(0, 0, 0, 0),
        bottomBar = {
            BottomNavigationBar(
                items = navItems,
                selectedItem = selectedItem,
                onItemSelected = onItemSelected
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(horizontal = Dimens.SpacingM)
        ) {
            // Back + Title Row
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = Dimens.SpacingM)
            ) {
                BackIconButton(descriptionKey = screenContent.titleKey, onClick = onBackClick, modifier = Modifier.padding(bottom = Dimens.SpacingL))
                Spacer(modifier = Modifier.width(Dimens.SpacingM))
                Text(
                    text = stringResource(id = com.example.watch_selling_app.R.string.watch_store_Title),
                    style = MaterialTheme.typography.titleLarge
                )
            }

            Spacer(modifier = Modifier.height(Dimens.SpacingM))

            // Brand filter row
            BrandListSection(
                brands = brands,
                selectedBrand = selectedBrand,
                onBrandSelected = { selectedBrand = it },
                modifier = Modifier.padding(bottom = Dimens.SpacingM)
            )

            // Grid of product cards
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.spacedBy(Dimens.SpacingM),
                horizontalArrangement = Arrangement.spacedBy(Dimens.SpacingM),
                contentPadding = PaddingValues(bottom = Dimens.watchStorePadding)
            ) {
                items(filteredProducts) { product ->
                    ProductCard(
                        product = product,
                        onClick = { onProductClick(product) },
                        onFavoriteClick = { FavoritesManager.toggleFavorite(product) }
                    )
                }
            }
        }
    }
}