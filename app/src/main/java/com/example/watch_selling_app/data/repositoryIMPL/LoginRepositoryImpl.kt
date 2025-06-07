package com.example.watch_selling_app.data.repositoryIMPL

import com.example.watch_selling_app.data.dataSource.AuthDataSource
import com.example.watch_selling_app.data.dataSource.DataSource
import com.example.watch_selling_app.domain.model.LoginContent
import com.example.watch_selling_app.domain.model.LoginFormData
import com.example.watch_selling_app.domain.model.LoginFormTextContent
import com.example.watch_selling_app.domain.repository.LoginRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LoginRepositoryImpl @Inject constructor() : LoginRepository {

    override fun getInitialLoginForm(): LoginFormData {
        return LoginFormData(
            email = AuthDataSource.getSavedEmail() ?: "",
            rememberMe = AuthDataSource.isRememberMeEnabled()
        )
    }

    override fun getSavedEmail(): String? {
        return AuthDataSource.getSavedEmail()
    }

    override fun isRememberMeEnabled(): Boolean {
        return AuthDataSource.isRememberMeEnabled()
    }

    override fun getLoginContent(): LoginContent {
        return DataSource.getLoginContent()
    }

    override fun getLoginFormTextContent(): LoginFormTextContent {
        return DataSource.getLoginFormTextContent()
    }


}