package com.feature.movie.data.mapper

import com.feature.movie.data.remote.dto.MovieResultRemoteModel
import com.feature.movie.domain.model.MovieResultModel

fun MovieResultRemoteModel.toMovieResultModel(): MovieResultModel {
    return MovieResultModel(
        adult = adult,
        backdropPath = backdropPath,
        genreIds = genreIds,
        id = id,
        originalLanguage = originalLanguage,
        originalTitle = originalTitle,
        overview = overview,
        popularity = popularity,
        posterPath = posterPath,
        releaseDate = releaseDate,
        title = title,
        video = video,
        voteAverage = voteAverage,
        voteCount = voteCount
    )
}