package com.example.watch_selling_app.presentation.components.product

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import com.example.watch_selling_app.R // Make sure this import exists
import com.example.watch_selling_app.ui.theme.Dimens
import com.example.watch_selling_app.ui.theme.LocalCustomColors

@Composable
fun AvailabilityBadge(
    isAvailable: Boolean,
    modifier: Modifier = Modifier
) {
    val isDarkTheme = isSystemInDarkTheme()

    val backgroundColor = if (isDarkTheme) {
        if (isAvailable) {
            MaterialTheme.colorScheme.onBackground
        } else {
            MaterialTheme.colorScheme.error
        }
    } else {
        if (isAvailable) {
            MaterialTheme.colorScheme.onBackground
        } else {
            MaterialTheme.colorScheme.error
        }
    }

    val textColor = if (isDarkTheme) {
        if (isAvailable) {
            MaterialTheme.colorScheme.onPrimary
        } else {
            MaterialTheme.colorScheme.onPrimary
        }
    } else {
        if (isAvailable) {
            MaterialTheme.colorScheme.onPrimary
        } else {
            MaterialTheme.colorScheme.onPrimary
        }
    }

    val text = if (isAvailable) {
        stringResource(id = R.string.available)
    } else {
        stringResource(id = R.string.not_available)
    }

    Text(
        text = text,
        color = textColor,
        style = MaterialTheme.typography.bodyLarge,
        modifier = modifier
            .background(
                color = backgroundColor,
                shape = RoundedCornerShape(size = Dimens.RadiusMedium)
            )
            .padding(horizontal = Dimens.SpacingM, vertical = Dimens.SpacingS)
    )
}
