package com.core.data.remote.network.service

import com.core.data.remote.dto.MovieRemoteModel
import retrofit2.http.GET


interface MoviesService {
    @GET("/3/movie/popular")
    suspend fun getMoviesList(): MovieRemoteModel
}