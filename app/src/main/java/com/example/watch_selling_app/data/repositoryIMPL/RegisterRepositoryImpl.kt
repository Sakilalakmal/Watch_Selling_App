package com.example.watch_selling_app.data.repositoryIMPL

import com.example.watch_selling_app.data.dataSource.DataSource
import com.example.watch_selling_app.domain.model.RegisterContent
import com.example.watch_selling_app.domain.model.RegisterFormTextContent
import com.example.watch_selling_app.domain.repository.RegisterRepository
import javax.inject.Inject

class RegisterRepositoryImpl @Inject constructor() : RegisterRepository {
    override fun getRegisterContent(): RegisterContent {
        return DataSource.getRegisterContent()
    }

    override fun getRegisterFormTextContent(): RegisterFormTextContent {
        return DataSource.getRegisterFormTextContent()
    }
}