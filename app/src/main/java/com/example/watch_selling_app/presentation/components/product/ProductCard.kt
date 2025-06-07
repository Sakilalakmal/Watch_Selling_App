package com.example.watch_selling_app.presentation.components.product

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.watch_selling_app.domain.model.ProductData
import com.example.watch_selling_app.ui.theme.Dimens
import com.example.watch_selling_app.ui.theme.LocalCustomColors
import com.example.watch_selling_app.utils.FavoritesManager

@Composable
fun ProductCard(
    product: ProductData,
    onClick: () -> Unit,
    onFavoriteClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    var isFavorited by remember { mutableStateOf(false) }

    Card(
        modifier = modifier
            .width(Dimens.productCardWidth)
            .clickable(onClick = onClick),
        shape = RoundedCornerShape(Dimens.RadiusMedium),
        colors = CardDefaults.cardColors(
            containerColor = LocalCustomColors.current.premiumGrey
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = Dimens.ElevationMedium)
    ) {
        Column {
            Box(modifier = Modifier
                .height(Dimens.productCardHeight)) {
                Image(
                    painter = painterResource(id = product.imageResId),
                    contentDescription = stringResource(id = product.modelNameResId),
                    modifier = Modifier
                        .fillMaxSize()
                        .clip(RoundedCornerShape(Dimens.RadiusMedium))
                )

                //favorite icon
                FavoriteButton(
                    modifier = Modifier
                        .align(Alignment.TopEnd),
                    isFavorite = FavoritesManager.isFavorite(product),
                    onClick = { onFavoriteClick() }
                )

            }

            Column(modifier = Modifier
                .padding(Dimens
                    .SpacingM),horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = stringResource(id = product.brandNameResId),
                    style = MaterialTheme.typography.headlineMedium
                        .copy(fontWeight = FontWeight.Bold),
                    color = MaterialTheme.colorScheme.onBackground
                )

                Spacer(modifier = modifier.height(Dimens.SpacingXXS))

                Text(
                    text = stringResource(id = product.modelNameResId),
                    style = MaterialTheme.typography.bodyLarge,
                    maxLines = 1
                )

                Text(
                    text = "$${"%,.2f".format(product.price.toFloat())}",
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.SemiBold,
                    color = MaterialTheme.colorScheme.error,
                    modifier = Modifier
                        .padding(top = Dimens.SpacingXS)
                )
            }
        }
    }
}

