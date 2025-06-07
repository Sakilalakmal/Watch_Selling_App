package com.example.watch_selling_app.presentation.components.product

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.watch_selling_app.domain.model.ProductData
import com.example.watch_selling_app.presentation.screen.Login_Screen.getSafeString
import com.example.watch_selling_app.ui.theme.Dimens

@Composable
fun FavoriteProductCard(
    product: ProductData,
    onRemoveFavorite: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .clip(RoundedCornerShape(Dimens.RadiusMedium))
            .background(MaterialTheme.colorScheme.surfaceContainerLow)
            .padding(Dimens.SpacingS)
    ) {

        // Image with delete icon overlay
        Box(modifier = Modifier.fillMaxWidth()) {
            Image(
                painter = painterResource(id = product.imageResId),
                contentDescription = product.modelNameResId.toString(),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(Dimens.productCardHeight)
                    .clip(RoundedCornerShape(Dimens.RadiusSmall)),
                contentScale = ContentScale.Crop
            )

            IconButton(
                onClick = {onRemoveFavorite()},
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(Dimens.SpacingXXS)
                    .size(Dimens.SpacingL)
            ) {
                Icon(
                    imageVector = Icons.Default.Delete,
                    contentDescription = "Remove Favorite",
                    tint = MaterialTheme.colorScheme.error
                )
            }
        }

        Spacer(modifier = Modifier.height(Dimens.SpacingXS))

        Text(
            text = getSafeString(product.modelNameResId.toString()),
            style = MaterialTheme.typography.labelMedium,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )

        Text(
            text = "Rs. ${product.price}",
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.primary
        )
    }

}
