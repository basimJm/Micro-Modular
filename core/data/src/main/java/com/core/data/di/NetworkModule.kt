package com.core.data.di

import com.core.data.remote.network.datasource.MoviesDataSource
import com.core.data.remote.network.interceptor.TokenInterceptor
import com.core.data.remote.network.service.MoviesService
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    private const val URL = "https://api.themoviedb.org"

    @Provides
    @Singleton
    fun provideKotlinJsonAdapterFactory(): KotlinJsonAdapterFactory = KotlinJsonAdapterFactory()

    @Provides
    @Singleton
    fun provideMoshi(kotlinJsonAdapterFactory: KotlinJsonAdapterFactory): Moshi = Moshi.Builder()
        .add(kotlinJsonAdapterFactory)
        .build()

    @Provides
    @Singleton
    fun provideMoshiConverterFactory(moshi: Moshi): MoshiConverterFactory =
        MoshiConverterFactory.create(moshi)

    @Provides
    @Singleton
    fun provideInterceptor(): Interceptor {
        return TokenInterceptor()
    }

    @Provides
    @Singleton
    fun provideOkHttp(): OkHttpClient =
        OkHttpClient
            .Builder()
            .build()

    @Provides
    @Singleton
    fun provideRetrofitClient(
        okHttp: OkHttpClient,
        moshiConverterFactory: MoshiConverterFactory
    ): Retrofit = Retrofit.Builder()
        .addConverterFactory(moshiConverterFactory)
        .client(okHttp)
        .baseUrl(URL)
        .build()

    @Provides
    @Singleton
    fun provideMoviesService(retrofit: Retrofit):MoviesService {
        return  retrofit.create(MoviesService::class.java)
    }

    @Provides
    @Singleton
    fun provideServiceDataSource(moviesService: MoviesService): MoviesDataSource {
        return MoviesDataSource(moviesService)
    }
}