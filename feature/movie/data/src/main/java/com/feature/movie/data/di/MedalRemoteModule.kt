package com.feature.movie.data.di

import com.feature.movie.data.remote.datasource.MoviesDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class MedalRemoteModule {

    @Provides
    @Singleton
    fun provideMovieDataSource(retrofit: Retrofit): MoviesDataSource {
        return retrofit.create()
    }
}