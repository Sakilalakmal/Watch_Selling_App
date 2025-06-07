package com.example.watch_selling_app.data.dataSource

import androidx.compose.ui.res.stringResource
import com.example.watch_selling_app.R
import com.example.watch_selling_app.domain.model.WatchStoreScreenContent

object WatchStoreScreenContentDataSource {

    fun getContent(): WatchStoreScreenContent {
        return WatchStoreScreenContent(
            titleKey = "watch_store_Title"
        )
    }
}