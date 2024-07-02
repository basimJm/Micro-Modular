package com.feature.movie.domain.usecase

import com.feature.movie.domain.repository.MovieRepository
import javax.inject.Inject

class MovieUseCase @Inject constructor(private val movieRepository: MovieRepository){


}