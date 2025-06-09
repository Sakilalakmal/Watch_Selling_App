package com.example.watch_selling_app.presentation.screen.Cart_Screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.watch_selling_app.data.dataSource.AddToCartScreenContentDataSource
import com.example.watch_selling_app.domain.model.AddToCartScreenContent
import com.example.watch_selling_app.presentation.components.AnimatedImageButton
import com.example.watch_selling_app.presentation.components.BackIconButton
import com.example.watch_selling_app.presentation.components.product.CartItemCard
import com.example.watch_selling_app.ui.theme.Dimens
import com.example.watch_selling_app.utils.CartManager

@Composable
fun CartScreen(
    onBackClick: () -> Unit,
    onProceedClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    val cartItems = CartManager.cartItems
    val totalPrice = CartManager.getTotalPrice()


    val screenContent: AddToCartScreenContent = AddToCartScreenContentDataSource.getContent()

    val title = context.resources.getIdentifier(screenContent.titleKey, "string", context.packageName).let {
        if (it != 0) stringResource(id = it) else "Add to Cart"
    }
    val subtitle = context.resources.getIdentifier(screenContent.subtitleKey, "string", context.packageName).let {
        if (it != 0) stringResource(id = it) else "My Picks"
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(Dimens.SpacingM)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            BackIconButton(descriptionKey = screenContent.titleKey, onClick = onBackClick,modifier = Modifier.padding(bottom = Dimens.SpacingL))
            Spacer(modifier = Modifier.width(Dimens.SpacingM))
            Column {
                Text(text = title, style = MaterialTheme.typography.titleLarge)

            }
        }

        Spacer(modifier = Modifier.height(Dimens.SpacingM))

        LazyColumn(modifier = Modifier.weight(1f)) {
            items(cartItems) { cartItem ->
                CartItemCard(
                    cartItem = cartItem,
                    onIncreaseQuantity = {
                        CartManager.updateQuantity(cartItem.product, cartItem.quantity + 1)
                    },
                    onDecreaseQuantity = {
                        CartManager.updateQuantity(cartItem.product, cartItem.quantity - 1)
                    },
                    onRemoveItem = {
                        CartManager.removeFromCart(cartItem.product)
                    }
                )
            }
        }

        Spacer(modifier = Modifier.height(Dimens.SpacingM))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Total: $${"%,.2f".format(totalPrice.toFloat())}",
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.primary
            )

            AnimatedImageButton(
                imageResLight = screenContent.proceedButtonKey,
                imageResDark = screenContent.proceedButtonKey,
                contentDescription = title,
                onClick = onProceedClick
            )
        }
    }
}

