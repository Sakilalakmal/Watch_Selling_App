package com.example.watch_selling_app.di

import com.example.watch_selling_app.data.repositoryIMPL.BrandRepositoryImpl
import com.example.watch_selling_app.data.repositoryIMPL.LoginRepositoryImpl
import com.example.watch_selling_app.data.repositoryIMPL.ProductRepositoryImpl
import com.example.watch_selling_app.data.repositoryIMPL.RegisterRepositoryImpl
import com.example.watch_selling_app.data.repositoryIMPL.SplashRepositoryImpl
import com.example.watch_selling_app.domain.repository.BrandRepository
import com.example.watch_selling_app.domain.repository.LoginRepository
import com.example.watch_selling_app.domain.repository.ProductRepository
import com.example.watch_selling_app.domain.repository.RegisterRepository
import com.example.watch_selling_app.domain.repository.SplashRepository
import com.example.watch_selling_app.domain.usecase.GetBrandsUseCase
import com.example.watch_selling_app.domain.usecase.GetCasualWatchesUseCase
import com.example.watch_selling_app.domain.usecase.GetProductsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideSplashRepository(): SplashRepository {
        return SplashRepositoryImpl()
    }

    @Provides
    @Singleton
    fun provideLoginRepository(): LoginRepository {
        return LoginRepositoryImpl()
    }

    @Provides
    @Singleton
    fun provideRegisterRepository(): RegisterRepository {
        return RegisterRepositoryImpl()
    }

    @Provides
    @Singleton
    fun provideProductRepository(): ProductRepository {
        return ProductRepositoryImpl()
    }

    @Provides
    @Singleton
    fun provideBrandRepository(): BrandRepository {
        return BrandRepositoryImpl()
    }

    @Provides
    @Singleton
    fun provideGetBrandsUseCase(
        brandRepository: BrandRepository
    ): GetBrandsUseCase {
        return GetBrandsUseCase(brandRepository)
    }

    @Provides
    @Singleton
    fun provideGetProductsUseCase(
        productRepository: ProductRepository
    ): GetProductsUseCase {
        return GetProductsUseCase(productRepository)
    }

    @Provides
    @Singleton
    fun provideGetCasualWatchesUseCase(
        productRepository: ProductRepository
    ): GetCasualWatchesUseCase {
        return GetCasualWatchesUseCase(productRepository)
    }
}
