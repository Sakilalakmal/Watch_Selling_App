package com.example.watch_selling_app.data.dataSource

import androidx.compose.ui.res.stringResource
import com.example.watch_selling_app.R
import com.example.watch_selling_app.domain.model.ProductData
import com.google.android.gms.analytics.ecommerce.Product

object ProductDataSource {
    fun getProducts(): List<ProductData> {
        return listOf(
            ProductData(
                brandNameResId = R.string.brand_rolex,
                brandImageDesc = R.string.rolex_watch_description,
                modelNameResId = R.string.rolex_mdodel_name,
                price = 8904,
                imageResId = R.drawable.rolex_watch,
                isFavorite = false,
                id = 1,
                watchDesc = R.string.about_watch,
                rating = 4.5f
            ),
            ProductData(
                brandNameResId = R.string.brand_rolex,
                brandImageDesc = R.string.rolex_watch_description,
                modelNameResId = R.string.rolex_mdodel_name,
                price = 8904,
                imageResId = R.drawable.rolex_watch,
                isFavorite = false,
                id = 2,
                watchDesc = R.string.about_watch,
                rating = 4.5f
            ),
            ProductData(
                brandNameResId = R.string.brand_rolex,
                brandImageDesc = R.string.rolex_watch_description,
                modelNameResId = R.string.rolex_mdodel_name,
                price =8904,
                imageResId = R.drawable.rolex_watch,
                isFavorite = false,
                id = 3,
                watchDesc = R.string.about_watch,
                rating = 4.5f
            ),
            ProductData(
                brandNameResId = R.string.brand_rolex,
                brandImageDesc = R.string.rolex_watch_description,
                modelNameResId = R.string.rolex_mdodel_name,
                price = 8904,
                imageResId = R.drawable.rolex_watch,
                isFavorite = false,
                id = 4,
                watchDesc = R.string.about_watch,
                rating = 4.5f
            ),
            ProductData(
                brandNameResId = R.string.brand_rolex,
                brandImageDesc = R.string.rolex_watch_description,
                modelNameResId = R.string.rolex_mdodel_name,
                price = 8904,
                imageResId = R.drawable.rolex_watch,
                isFavorite = false,
                id = 5,
                watchDesc = R.string.about_watch,
                rating = 4.5f
            ),
            ProductData(
                brandNameResId = R.string.brand_rolex,
                brandImageDesc = R.string.rolex_watch_description,
                modelNameResId = R.string.rolex_mdodel_name,
                price = 8904,
                imageResId = R.drawable.rolex_watch,
                isFavorite = false,
                id = 6,
                watchDesc = R.string.about_watch,
                rating = 4.5f
            ),

        )
    }


}