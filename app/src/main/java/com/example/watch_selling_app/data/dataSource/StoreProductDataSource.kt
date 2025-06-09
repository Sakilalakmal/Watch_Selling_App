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
                imageResId = R.drawable.g_shock_red,
                isFavorite = false,
                id = 13,
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
                id = 14,
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
                id = 15,
                watchDesc = R.string.about_seamaster,
                rating = 4.5f
            ),
            ProductData(
                id = 16,
                brandNameResId = R.string.brand_gshock,
                modelNameResId =R.string.gshock_ga_110hc,
                price = 1204,
                imageResId =  R.drawable.gschok_blue,
                brandImageDesc = R.string.brand_gshock_description,
                isFavorite = false,
                watchDesc = R.string.about_gschock_blue,
                rating = 4.5f
            ),
            ProductData(
                brandNameResId = R.string.brand_tissot,
                brandImageDesc = R.string.brand_tissot_description,
                modelNameResId = R.string.tissot_heritage_model,
                price = 8904,
                imageResId = R.drawable.tissot_heritage,
                isFavorite = false,
                id = 17,
                watchDesc = R.string.about_tissot_heritage,
                rating = 4.5f
            ),
            ProductData(
                brandNameResId = R.string.brand_seiko,
                brandImageDesc = R.string.brand_seiko_description,
                modelNameResId = R.string.seiko_c5_mdodel_name,
                price =16500,
                imageResId = R.drawable.seiko_srz550p1,
                isFavorite = false,
                id = 18,
                watchDesc = R.string.about_seiko_srz550p1,
                rating = 4.8f
            )

        )

    }
}