package com.example.watch_selling_app.data.dataSource

import androidx.compose.ui.res.stringResource
import com.example.watch_selling_app.R
import com.example.watch_selling_app.domain.model.ProductData
import com.google.android.gms.analytics.ecommerce.Product

object ProductDataSource {
    fun getProducts(): List<ProductData> {
        return listOf(
            ProductData(
                brandNameResId = R.string.brand_romear,
                brandImageDesc = R.string.romer_watch_description,
                modelNameResId = R.string.romer_brand_name,
                price = 8904,
                imageResId = R.drawable.romer,
                isFavorite = false,
                id = 1,
                watchDesc = R.string.roamer_desc,
                rating = 4.5f
            ),
            ProductData(
                brandNameResId = R.string.brand_citizen,
                brandImageDesc = R.string.brand_citizen_description,
                modelNameResId = R.string.citizen_green_model,
                price = 8904,
                imageResId = R.drawable.citizen_green_one,
                isFavorite = false,
                id = 2,
                watchDesc = R.string.citizen_green_watch,
                rating = 4.5f
            ),
            ProductData(
                brandNameResId = R.string.brand_seiko,
                brandImageDesc = R.string.brand_seiko_description,
                modelNameResId = R.string.seiko_c5_mdodel_name,
                price =16500,
                imageResId = R.drawable.seiko_srz550p1,
                isFavorite = false,
                id = 3,
                watchDesc = R.string.about_seiko_srz550p1,
                rating = 4.8f
            ),
            ProductData(
                brandNameResId = R.string.brand_casio,
                brandImageDesc = R.string.brand_casio_description,
                modelNameResId = R.string.casio_cas5_model,
                price = 8904,
                imageResId = R.drawable.casio_cas5,
                isFavorite = false,
                id = 4,
                watchDesc = R.string.about_casio_cas5,
                rating = 4.5f
            ),
            ProductData(
                brandNameResId = R.string.brand_tissot,
                brandImageDesc = R.string.brand_tissot_description,
                modelNameResId = R.string.tissot_heritage_model,
                price = 8904,
                imageResId = R.drawable.tissot_heritage,
                isFavorite = false,
                id = 5,
                watchDesc = R.string.about_tissot_heritage,
                rating = 4.5f
            ),
            ProductData(
                brandNameResId = R.string.brand_gshock,
                brandImageDesc = R.string.brand_gshock_description,
                modelNameResId = R.string.gshock_model_ga900,
                price = 8904,
                imageResId = R.drawable.g_shock_ga_900,
                isFavorite = false,
                id = 6,
                watchDesc = R.string.about_gshock_900,
                rating = 4.5f
            ),

        )
    }


}