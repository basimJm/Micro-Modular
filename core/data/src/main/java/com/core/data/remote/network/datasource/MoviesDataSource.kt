package com.core.data.remote.network.datasource

import com.core.data.remote.dto.MovieResultRemoteModel
import com.core.data.remote.network.service.MoviesService
import javax.inject.Inject

class MoviesDataSource @Inject constructor(private val moviesService: MoviesService) {

    suspend fun getMoviesList(): List<MovieResultRemoteModel>? {
        return moviesService.getMoviesList().results
    }
}