package com.example.watch_selling_app.data.dataSource

import com.example.watch_selling_app.R
import com.example.watch_selling_app.domain.model.ProductData

object CasualProductDataSource {
    fun getCasualWatches(): List<ProductData> {
        return listOf(
            ProductData(
                id = 7,
                brandNameResId = R.string.brand_casio,
                modelNameResId =R.string.casio_mtp_1384bul,
                price = 1204,
                imageResId =  R.drawable.casio_mtp,
                brandImageDesc = R.string.brand_casio_description,
                isFavorite = false,
                watchDesc = R.string.about_casio_mtp,
                rating = 4.5f
            ),

            ProductData(
                id = 8,
                brandNameResId = R.string.brand_citizen,
                modelNameResId =R.string.citizen_ecodrive,
                price = 1204,
                imageResId =  R.drawable.citizen_ca0645,
                brandImageDesc = R.string.brand_citizen_description,
                isFavorite = false,
                watchDesc = R.string.about_citizen_ecodrive,
                rating = 4.2f
            ),
            ProductData(
                id = 9,
                brandNameResId = R.string.brand_seiko,
                modelNameResId =R.string.seiko_SSC775P1,
                price = 1204,
                imageResId =  R.drawable.seiko_ssc775p1,
                brandImageDesc = R.string.brand_seiko_description,
                isFavorite = false,
                watchDesc = R.string.about_seiko_ssc775p1,
                rating = 4.5f
            ),
            ProductData(
                id = 10,
                brandNameResId = R.string.brand_romear,
                modelNameResId =R.string.roamer_model_name_50887,
                price = 1204,
                imageResId =  R.drawable.roamer_508837,
                brandImageDesc = R.string.roamer_watch_description,
                isFavorite = false,
                watchDesc = R.string.about_watch,
                rating = 4.1f
            ),
            ProductData(
                id = 11,
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
                id = 12,
                brandNameResId = R.string.brand_tissot,
                modelNameResId =R.string.tissot_cyling_mdodel_name,
                price = 1204,
                imageResId =  R.drawable.tissot_casual_second,
                brandImageDesc = R.string.brand_tissot_description,
                isFavorite = false,
                watchDesc = R.string.about_watch_tissot_france,
                rating = 4.5f
            ),
        )
    }
}