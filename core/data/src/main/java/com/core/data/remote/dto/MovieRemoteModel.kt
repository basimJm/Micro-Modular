package com.core.data.remote.dto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MovieRemoteModel(
    @Json(name = "page") val page: Int? = null,
    @Json(name = "results") val results: List<MovieResultRemoteModel>? = null,
)
