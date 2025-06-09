package com.example.watch_selling_app.presentation.components.product

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.watch_selling_app.domain.model.CartItemData
import com.example.watch_selling_app.presentation.components.product.QuantitySelector
import com.example.watch_selling_app.ui.theme.Dimens

@Composable
fun CartItemCard(
    cartItem: CartItemData,
    onIncreaseQuantity: () -> Unit,
    onDecreaseQuantity: () -> Unit,
    onRemoveItem: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(Dimens.SpacingS),
        shape = RoundedCornerShape(Dimens.RadiusSmall),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceContainerLow
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(Dimens.SpacingS),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Product Image
            Image(
                painter = painterResource(id = cartItem.product.imageResId),
                contentDescription = stringResource(id = cartItem.product.modelNameResId),
                modifier = Modifier
                    .size(Dimens.addToCartImageSize)

            )

            Spacer(modifier = Modifier.width(Dimens.SpacingS))

            // Product Info + Quantity
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = stringResource(id = cartItem.product.brandNameResId),
                    style = MaterialTheme.typography.titleLarge,
                    color = MaterialTheme.colorScheme.onBackground
                )
                Spacer(modifier = Modifier.height(Dimens.SpacingXXS))
                Text(
                    text = stringResource(id = cartItem.product.modelNameResId),
                    style = MaterialTheme.typography.titleMedium,
                    maxLines = 1
                )
                Spacer(modifier = Modifier.height(Dimens.SpacingXXS))
                Text(
                    text = "$ ${cartItem.product.price * cartItem.quantity}",
                    style = MaterialTheme.typography.titleMedium,
                    color = MaterialTheme.colorScheme.primary
                )
                Spacer(modifier = Modifier.height(Dimens.SpacingXXS))

                QuantitySelector(
                    quantity = cartItem.quantity,
                    onIncrease = onIncreaseQuantity,
                    onDecrease = onDecreaseQuantity,
                    modifier = Modifier.padding(top = Dimens.SpacingXXS)
                )
            }

            // Delete Icon
            IconButton(
                onClick = onRemoveItem,
                modifier = Modifier
                    .padding(start = Dimens.SpacingXS)
                    .align(Alignment.Top)
            ) {
                Icon(
                    imageVector = Icons.Default.Delete,
                    contentDescription = "Remove Item",
                    tint = MaterialTheme.colorScheme.error
                )
            }
        }
    }
}