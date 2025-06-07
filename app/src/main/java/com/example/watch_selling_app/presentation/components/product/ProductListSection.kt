package com.example.watch_selling_app.presentation.components.product


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.watch_selling_app.R
import com.example.watch_selling_app.data.dataSource.CasualProductDataSource
import com.example.watch_selling_app.domain.model.ProductData
import com.example.watch_selling_app.ui.theme.Dimens

@Composable
fun ProductListSection(
    modifier: Modifier = Modifier,
    titleResId: Int = R.string.products, //title for product list
    products: List<ProductData>,
    onProductClick: (ProductData) -> Unit,
    onFavoriteClick: (ProductData) -> Unit,
    refreshTrigger: Int

) {
    Column(modifier = modifier
        .padding(top = Dimens.SpacingXL)) {
        Text(
            text = stringResource(id = titleResId),
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(horizontal = Dimens.SpacingM)
        )

        Spacer(modifier = Modifier.height(Dimens.SpacingS))

        LazyRow(
            contentPadding = PaddingValues(horizontal = Dimens.SpacingM),
            horizontalArrangement = Arrangement.spacedBy(Dimens.SpacingS)
        ) {
            items(products) { product ->
                ProductCard(
                    product = product,
                    onClick = { onProductClick(product) },
                    onFavoriteClick = { onFavoriteClick(product) },


                )
            }
        }
    }
}





