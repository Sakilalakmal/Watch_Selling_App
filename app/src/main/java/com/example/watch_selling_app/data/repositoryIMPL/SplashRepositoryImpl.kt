package com.example.watch_selling_app.data.repositoryIMPL


import com.example.watch_selling_app.data.dataSource.DataSource
import com.example.watch_selling_app.domain.model.SplashContent
import com.example.watch_selling_app.domain.repository.SplashRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SplashRepositoryImpl @Inject constructor() : SplashRepository {
    override fun getSplashContent(): SplashContent {
        return DataSource.getSplashContent()
    }
}


