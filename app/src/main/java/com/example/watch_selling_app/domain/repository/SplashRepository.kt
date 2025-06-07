package com.example.watch_selling_app.domain.repository

import com.example.watch_selling_app.domain.model.SplashContent

interface SplashRepository {
    fun getSplashContent(): SplashContent
}