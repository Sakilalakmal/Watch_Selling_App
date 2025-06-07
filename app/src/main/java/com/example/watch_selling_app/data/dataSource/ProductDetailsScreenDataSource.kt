package com.example.watch_selling_app.data.dataSource

import androidx.compose.ui.res.stringResource
import com.example.watch_selling_app.R
import com.example.watch_selling_app.domain.model.ProductDetailsScreenData

object ProductDetailsScreenDataSource {

    fun getScreenData(): ProductDetailsScreenData {
        return ProductDetailsScreenData(
            checkoutButtonResId = R.drawable.checkout_btn,
            checkoutDescriptionResId = R.string.checkout_btn_desc,
            titleDescriptionResId = R.string.Description
        )
    }

}