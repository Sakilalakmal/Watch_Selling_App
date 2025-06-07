package com.example.watch_selling_app.data.dataSource

import com.example.watch_selling_app.R
import com.example.watch_selling_app.domain.model.ProductData

object CasualProductDataSource {
    fun getCasualWatches(): List<ProductData> {
        return listOf(
            ProductData(
                id = 1,
                brandNameResId = R.string.brand_rolex,
                modelNameResId =R.string.rolex_mdodel_name,
                price = 1204,
                imageResId =  R.drawable.rolex_watch,
                brandImageDesc = R.string.rolex_watch_description,
                isFavorite = false,
                watchDesc = R.string.about_watch,
                rating = 4.5f
            ),

            ProductData(
                id = 2,
                brandNameResId = R.string.brand_rolex,
                modelNameResId =R.string.rolex_mdodel_name,
                price = 1204,
                imageResId =  R.drawable.rolex_watch,
                brandImageDesc = R.string.rolex_watch_description,
                isFavorite = false,
                watchDesc = R.string.about_watch,
                rating = 4.5f
            ),
            ProductData(
                id = 3,
                brandNameResId = R.string.brand_rolex,
                modelNameResId =R.string.rolex_mdodel_name,
                price = 1204,
                imageResId =  R.drawable.rolex_watch,
                brandImageDesc = R.string.rolex_watch_description,
                isFavorite = false,
                watchDesc = R.string.about_watch,
                rating = 4.5f
            ),
            ProductData(
                id = 4,
                brandNameResId = R.string.brand_rolex,
                modelNameResId =R.string.rolex_mdodel_name,
                price = 1204,
                imageResId =  R.drawable.rolex_watch,
                brandImageDesc = R.string.rolex_watch_description,
                isFavorite = false,
                watchDesc = R.string.about_watch,
                rating = 4.5f
            ),
            ProductData(
                id = 5,
                brandNameResId = R.string.brand_rolex,
                modelNameResId =R.string.rolex_mdodel_name,
                price = 1204,
                imageResId =  R.drawable.rolex_watch,
                brandImageDesc = R.string.rolex_watch_description,
                isFavorite = false,
                watchDesc = R.string.about_watch,
                rating = 4.5f
            ),
            ProductData(
                id = 6,
                brandNameResId = R.string.brand_rolex,
                modelNameResId =R.string.rolex_mdodel_name,
                price = 1204,
                imageResId =  R.drawable.rolex_watch,
                brandImageDesc = R.string.rolex_watch_description,
                isFavorite = false,
                watchDesc = R.string.about_watch,
                rating = 4.5f
            ),
        )
    }
}