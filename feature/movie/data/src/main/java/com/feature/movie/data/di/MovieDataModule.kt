package com.feature.movie.data.di

import com.core.data.remote.network.datasource.MoviesDataSource
import com.feature.movie.data.repository.MovieRepositoryImpl
import com.feature.movie.domain.repository.MovieRepository
import dagger.Binds
import dagger.Module
import dagger.Reusable
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class MovieDataModule {

    @Binds
    abstract fun provideMovieRepository(movieRepositoryImpl: MovieRepositoryImpl): MovieRepository

}