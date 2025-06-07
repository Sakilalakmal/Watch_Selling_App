package com.example.watch_selling_app.presentation.components.product


import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.watch_selling_app.domain.model.QuantitySelectorConfig
import com.example.watch_selling_app.ui.theme.Dimens

@Composable
fun QuantitySelector(
    quantity: Int,
    onIncrease: () -> Unit,
    onDecrease: () -> Unit,
    config: QuantitySelectorConfig = QuantitySelectorConfig(),
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Button(
            onClick = onDecrease,
            enabled = config.isEnabled && quantity > config.minQuantity,
            contentPadding = PaddingValues(horizontal = Dimens.SpacingXS)
        ) {
            Text(text = "-")
        }

        Spacer(modifier = Modifier.width(Dimens.SpacingM))

        Text(
            text = quantity.toString(),
            style = MaterialTheme.typography.bodyLarge
        )

        Spacer(modifier = Modifier.width(Dimens.SpacingM))

        Button(
            onClick = onIncrease,
            enabled = config.isEnabled && quantity < config.maxQuantity,
            contentPadding = PaddingValues(horizontal = Dimens.SpacingXS)
        ) {
            Text(text = "+")
        }
    }
}

