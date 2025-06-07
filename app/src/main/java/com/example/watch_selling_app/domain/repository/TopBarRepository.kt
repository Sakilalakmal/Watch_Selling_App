package com.example.watch_selling_app.domain.repository

import com.example.watch_selling_app.domain.model.SearchBarContent
import com.example.watch_selling_app.domain.model.TopBarContent

interface TopBarRepository {
    fun getTopBarContent(): TopBarContent
    fun getSearchBarContent(): SearchBarContent
}