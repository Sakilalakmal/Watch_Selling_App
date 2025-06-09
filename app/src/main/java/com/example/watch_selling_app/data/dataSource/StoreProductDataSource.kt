package com.example.watch_selling_app.data.dataSource

import com.example.watch_selling_app.R
import com.example.watch_selling_app.domain.model.ProductData

object StoreProductDataSource {

    fun getStoreProducts(): List<ProductData> {
        return listOf(
            ProductData(
                brandNameResId = R.string.brand_gshock,
                brandImageDesc = R.string.brand_gshock_description,
                modelNameResId = R.string.gshock_50CP,
                price = 2500,
                imageResId = R.drawable.g_shock,
                isFavorite = false,
                id = 1,
                watchDesc = R.string.gshock_desc,
                rating = 4.5f
            ),
            ProductData(
                brandNameResId = R.string.brand_rolex,
                brandImageDesc = R.string.rolex_watch_description,
                modelNameResId = R.string.rolex_gmt_master,
                price = 12500,
                imageResId = R.drawable.rolex_gmt_master_2,
                isFavorite = false,
                id = 1,
                watchDesc = R.string.about_rolex_gmt_master,
                rating = 4.5f
            ),
            ProductData(
                brandNameResId = R.string.brand_omega,
                brandImageDesc = R.string.brand_omega_description,
                modelNameResId = R.string.omgea_seamaster,
                price = 25200,
                imageResId = R.drawable.omega_seamaster_aqua_terra_150m,
                isFavorite = false,
                id = 1,
                watchDesc = R.string.about_seamaster,
                rating = 4.5f
            )

        )

    }
}