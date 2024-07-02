package com.feature.movie.domain.repository

import com.feature.movie.domain.model.MovieResultModel

interface MovieRepository {
    suspend fun getMoviesList():List<MovieResultModel>?

}