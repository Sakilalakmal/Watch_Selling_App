package com.example.watch_selling_app.domain.repository

import com.example.watch_selling_app.domain.model.LoginContent
import com.example.watch_selling_app.domain.model.LoginFormData
import com.example.watch_selling_app.domain.model.LoginFormTextContent

interface LoginRepository {
    fun getInitialLoginForm(): LoginFormData
    fun getSavedEmail(): String?
    fun isRememberMeEnabled(): Boolean
    fun getLoginContent(): LoginContent
    fun getLoginFormTextContent(): LoginFormTextContent


}
