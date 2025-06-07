package com.example.watch_selling_app.data.repositoryIMPL

import com.example.watch_selling_app.data.dataSource.DataSource
import com.example.watch_selling_app.domain.model.SearchBarContent
import com.example.watch_selling_app.domain.model.TopBarContent
import com.example.watch_selling_app.domain.repository.TopBarRepository

class TopBarRepositoryImpl : TopBarRepository {
    override fun getTopBarContent(): TopBarContent {
        return DataSource.getTopBarContent()
    }

    override fun getSearchBarContent(): SearchBarContent {
        return DataSource.getSearchBarContent()
    }
}