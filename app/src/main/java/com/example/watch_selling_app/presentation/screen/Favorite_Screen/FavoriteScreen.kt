package com.example.watch_selling_app.presentation.screen.Favorite_Screen


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.watch_selling_app.R
import com.example.watch_selling_app.domain.model.BottomNavItem
import com.example.watch_selling_app.domain.model.ProductData
import com.example.watch_selling_app.presentation.components.BackIconButton
import com.example.watch_selling_app.presentation.components.BottomNavigationBar
import com.example.watch_selling_app.presentation.components.product.FavoriteProductCard
import com.example.watch_selling_app.presentation.screen.Login_Screen.getSafeString
import com.example.watch_selling_app.ui.theme.Dimens
import com.example.watch_selling_app.utils.FavoritesManager

@Composable
fun FavoriteScreen(
    navItems: List<BottomNavItem>,
    selectedItem: BottomNavItem,
    onItemSelected: (BottomNavItem) -> Unit,
    onBackClick: () -> Unit
) {
    var refreshTrigger by remember { mutableStateOf(0) }
    val favoriteProducts = remember(refreshTrigger) { FavoritesManager.getFavorites() }

    Scaffold(
        bottomBar = {
            BottomNavigationBar(
                items = navItems,
                selectedItem = selectedItem,
                onItemSelected = onItemSelected,
                modifier = Modifier.fillMaxWidth()
            )
        },
        contentWindowInsets = WindowInsets(0, 0, 0, 0) // disables default bottom inset
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues) // accounts for nav bar space
        ) {
            // Top bar with back icon and title
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(Dimens.SpacingM)
            ) {
                BackIconButton(
                    modifier = Modifier
                        .padding(bottom = Dimens.SpacingL)
                        .align(Alignment.CenterStart),
                    onClick = onBackClick,
                    descriptionKey = getSafeString("back_button_description"),
                )

                Text(
                    text = getSafeString(R.string.favorite_title.toString()),
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.align(Alignment.Center)
                )
            }

            Spacer(modifier = Modifier.height(Dimens.SpacingS))

            // Grid of favorite products
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = Dimens.SpacingM),
                verticalArrangement = Arrangement.spacedBy(Dimens.SpacingM),
                horizontalArrangement = Arrangement.spacedBy(Dimens.SpacingM)
            ) {
                items(favoriteProducts) { product ->
                    FavoriteProductCard(
                        product = product,
                        onRemoveFavorite = {
                            FavoritesManager.removeFavorite(product)
                            refreshTrigger++
                        },
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }
        }
    }
}


