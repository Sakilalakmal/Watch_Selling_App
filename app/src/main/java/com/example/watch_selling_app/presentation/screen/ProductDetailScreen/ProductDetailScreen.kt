package com.example.watch_selling_app.presentation.screen.ProductDetailScreen

import android.graphics.Paint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.watch_selling_app.data.dataSource.ProductDetailsScreenDataSource
import com.example.watch_selling_app.presentation.components.AnimatedImageButton
import com.example.watch_selling_app.presentation.components.BackIconButton
import com.example.watch_selling_app.presentation.components.RatingBar
import com.example.watch_selling_app.presentation.components.product.AvailabilityBadge
import com.example.watch_selling_app.presentation.components.product.FavoriteButton
import com.example.watch_selling_app.presentation.components.product.QuantitySelector
import com.example.watch_selling_app.ui.theme.Dimens
import com.example.watch_selling_app.utils.CartManager
import com.example.watch_selling_app.utils.ProductHolder

@Composable
fun ProductDetailScreen(
    onBackClick: () -> Unit,
    onCheckoutClick: () -> Unit

) {
    val product = ProductHolder.selectedProduct

    if (product == null) {
        // Fallback if no product selected
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Text(text = "No product selected", style = MaterialTheme.typography.bodyLarge)
        }
        return
    }

    val screenData = ProductDetailsScreenDataSource.getScreenData()
    var quantity by remember { mutableStateOf(product.quantity) }
    var isFavorite by remember { mutableStateOf(product.isFavorite) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(Dimens.SpacingM)
    ) {
        // Header Row: Back + Title + Favorite
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            BackIconButton(
                descriptionKey = stringResource(id = screenData.checkoutDescriptionResId),
                onClick = onBackClick
            )
            Spacer(modifier = Modifier.width(Dimens.SpacingS))
            Text(
                text = stringResource(id = product.modelNameResId),
                style = MaterialTheme.typography.titleLarge,
                color = MaterialTheme.colorScheme.onBackground,
                modifier = Modifier.weight(1f)
            )
            FavoriteButton(
                modifier = Modifier,
                isFavorite = isFavorite,
                onClick = { isFavorite = !isFavorite }
            )
        }

        Spacer(modifier = Modifier.height(Dimens.SpacingM))

        // Product Image inside Card
        Box {
            Card(
                shape = RoundedCornerShape(Dimens.RadiusMedium),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(Dimens.productDetailsImage)
            ) {
                Image(
                    painter = painterResource(id = product.imageResId),
                    contentDescription = stringResource(id = product.brandImageDesc),
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .padding(bottom = Dimens.SpacingXL)
                        .fillMaxSize()
                )
            }

            AvailabilityBadge(
                isAvailable = true,
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(Dimens.SpacingS)
            )
        }

        Spacer(modifier = Modifier.height(Dimens.SpacingM))

        // Product Title
        Text(
            text = stringResource(id = product.modelNameResId),
            style = MaterialTheme.typography.titleMedium,
            color = MaterialTheme.colorScheme.onBackground
        )

        Spacer(modifier = Modifier.height(Dimens.SpacingS))

        // Rating and Quantity
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            RatingBar(rating = product.rating)
            QuantitySelector(
                quantity = quantity,
                onIncrease = { quantity++ },
                onDecrease = { if (quantity > 1) quantity-- }
            )
        }

        Spacer(modifier = Modifier.height(Dimens.SpacingM))

        // Description Title
        Text(
            text = stringResource(id = screenData.titleDescriptionResId),
            style = MaterialTheme.typography.titleMedium,
            color = MaterialTheme.colorScheme.onBackground
        )

        Spacer(modifier = Modifier.height(Dimens.SpacingXS))

        // Description Body
        Text(
            text = stringResource(id = product.watchDesc),
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onBackground
        )

        Spacer(modifier = Modifier.height(Dimens.SpacingL))

        // Price
        Text(
            text = "$ ${product.price}",
            style = MaterialTheme.typography.titleLarge,
            color = MaterialTheme.colorScheme.primary
        )

        Spacer(modifier = Modifier.height(Dimens.SpacingM))

        // Checkout Button
        AnimatedImageButton(
            imageResLight = screenData.checkoutButtonResId,
            imageResDark = screenData.checkoutButtonResId,
            contentDescription = stringResource(id = screenData.checkoutDescriptionResId),
            modifier = Modifier
                .fillMaxWidth()
                .height(Dimens.ButtonHeight),
            onClick = {
                CartManager.addToCart(product, quantity)
                onCheckoutClick()
            }
        )
    }
}
