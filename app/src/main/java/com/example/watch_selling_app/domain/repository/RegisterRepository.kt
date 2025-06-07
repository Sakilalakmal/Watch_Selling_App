package com.example.watch_selling_app.domain.repository

import com.example.watch_selling_app.domain.model.RegisterContent
import com.example.watch_selling_app.domain.model.RegisterFormTextContent

interface RegisterRepository {
    fun getRegisterContent(): RegisterContent
    fun getRegisterFormTextContent(): RegisterFormTextContent

}