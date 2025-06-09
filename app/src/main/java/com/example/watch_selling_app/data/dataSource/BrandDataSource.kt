package com.example.watch_selling_app.data.dataSource

import com.example.watch_selling_app.R
import com.example.watch_selling_app.domain.model.BrandData

object BrandDataSource {

    fun getBrands(): List<BrandData> = listOf(
        BrandData(
            nameResId = R.string.brand_rolex,
            logoDescriptionResId = R.string.brand_rolex_description,
            logoResId = R.drawable.rolex,
            id = 1,

        ),
        BrandData(
            nameResId = R.string.brand_omega,
            logoDescriptionResId = R.string.brand_omega_description,
            logoResId = R.drawable.omega,
            id = 2
        ),
        BrandData(
            nameResId = R.string.brand_tag_heuer,
            logoDescriptionResId = R.string.brand_tag_heuer_description,
            logoResId = R.drawable.tag_heuer,
            id = 3
        ),
        BrandData(
            nameResId = R.string.brand_tissot,
            logoDescriptionResId = R.string.brand_tissot_description,
            logoResId = R.drawable.tissot,
            id = 4
        ),
        BrandData(
            nameResId = R.string.brand_casio,
            logoDescriptionResId = R.string.brand_casio_description,
            logoResId = R.drawable.casio,
            id = 5
        ),
        BrandData(
            nameResId = R.string.brand_citizen,
            logoDescriptionResId = R.string.brand_citizen_description,
            logoResId = R.drawable.citizen,
            id = 6
        ),
        BrandData(
            nameResId = R.string.brand_seiko,
            logoDescriptionResId = R.string.brand_seiko_description,
            logoResId = R.drawable.seiko,
            id = 7
        ),
        BrandData(
            nameResId = R.string.brand_gshock,
            logoDescriptionResId = R.string.brand_gshock_description,
            logoResId = R.drawable.g_shock,
            id = 8
        )
    )
}