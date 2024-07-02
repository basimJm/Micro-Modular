package com.feature.movie.data.repository

import com.core.data.remote.network.datasource.MoviesDataSource
import com.feature.movie.data.mapper.toMovieResultModel
import com.feature.movie.domain.model.MovieResultModel
import com.feature.movie.domain.repository.MovieRepository
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(private val moviesDataSource: MoviesDataSource) :
    MovieRepository {
    override suspend fun getMoviesList(): List<MovieResultModel>? {
        return moviesDataSource.getMoviesList()?.map { it.toMovieResultModel() }
    }
}