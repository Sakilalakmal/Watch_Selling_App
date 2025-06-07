package com.example.watch_selling_app.presentation.components.carouselSlider

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.watch_selling_app.domain.model.CarouselItem
import com.example.watch_selling_app.presentation.screen.Login_Screen.getSafeString
import com.example.watch_selling_app.ui.theme.Dimens

@Composable
fun CarouselCard(item: CarouselItem, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .padding(horizontal = Dimens.SpacingM)
            .fillMaxWidth()
            .height(180.dp), // You can adjust height
        shape = RoundedCornerShape(Dimens.RadiusLarge),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Image(
            painter = painterResource(id = item.imageResId),
            contentDescription = item.descriptionKey,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
    }
}
