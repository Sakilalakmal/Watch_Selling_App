package com.example.watch_selling_app.presentation.components.brand

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
import androidx.compose.ui.tooling.preview.Preview
import com.example.watch_selling_app.R
import com.example.watch_selling_app.domain.model.BrandData
import com.example.watch_selling_app.ui.theme.Dimens

@Composable
fun BrandListSection(
    brands: List<BrandData>,
    selectedBrand: BrandData?,
    onBrandSelected: (BrandData) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Text(
            text = stringResource(id = R.string.brand_title),
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(horizontal = Dimens.SpacingM)
        )

        LazyRow(
            modifier = Modifier.padding(top = Dimens.SpacingS),
            horizontalArrangement = Arrangement.spacedBy(Dimens.SpacingS),
            contentPadding = PaddingValues(horizontal = Dimens.SpacingM)
        ) {
            items(brands) { brand->
                BrandItem(
                    brand = brand,
                    isSelected = brand.id == selectedBrand?.id,
                    onClick = { onBrandSelected(brand) }
                )
            }

        }
    }
}


