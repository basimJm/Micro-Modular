package com.feature.movie.data.remote.datasource

import com.feature.movie.data.remote.dto.MovieRemoteModel
import retrofit2.http.GET

interface MoviesDataSource {
    @GET("/3/movie/popular")
    suspend fun getMoviesList(): MovieRemoteModel
}