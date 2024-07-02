package com.core.common.utils

sealed class ResponseState<T>(data: T? = null, message: String? = null) {
    class Loading<T> : ResponseState<T>()
    data class Success<T>(var data: T? = null) : ResponseState<T>()
    data class Error<T>(var message: String?) : ResponseState<T>()
}