package com.example.watch_selling_app.presentation.components.product

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.watch_selling_app.R
import com.example.watch_selling_app.domain.model.ProductData
import com.example.watch_selling_app.ui.theme.Dimens

@Composable
fun CasualWatchSection(
    modifier: Modifier = Modifier,
    products: List<ProductData>,
    onProductClick: (ProductData) -> Unit,
    onFavoriteClick: (ProductData) -> Unit
) {
    Column(modifier = modifier
        .padding(top = Dimens.SpacingXL)) {
        Text(
            text = stringResource(R.string.casual_watches),
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(horizontal = Dimens.SpacingM)
        )

        LazyRow(
            modifier = Modifier.padding(top = Dimens.SpacingS),
            horizontalArrangement = Arrangement.spacedBy(Dimens.SpacingS),
            contentPadding = PaddingValues(horizontal = Dimens.SpacingM)
        ) {
            items (products) { product ->
                ProductCard(
                    product = product,
                    onClick = {  onProductClick(product) },
                    onFavoriteClick = { onFavoriteClick(product)}
                )
            }

        }
    }
}
