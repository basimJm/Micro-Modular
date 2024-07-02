package com.feature.movie.domain.model

data class MovieModel(
    val page: Int,
    val results: List<MovieResultModel>
)
