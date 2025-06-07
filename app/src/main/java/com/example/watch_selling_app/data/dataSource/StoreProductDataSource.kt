package com.example.watch_selling_app.data.dataSource

import com.example.watch_selling_app.R
import com.example.watch_selling_app.domain.model.ProductData

object StoreProductDataSource {

    fun getStoreProducts(): List<ProductData> {
        return listOf(
            ProductData(
                brandNameResId = R.string.brand_rolex,
                brandImageDesc = R.string.rolex_watch_description,
                modelNameResId = R.string.rolex_mdodel_name,
                price = 2500,
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
                price = 2500,
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
                price = 2500,
                imageResId = R.drawable.rolex_watch,
                isFavorite = false,
                id = 1,
                watchDesc = R.string.about_watch,
                rating = 4.5f
            )

        )

    }
}