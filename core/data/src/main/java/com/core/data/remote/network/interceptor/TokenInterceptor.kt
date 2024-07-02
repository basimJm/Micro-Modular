package com.core.data.remote.network.interceptor

import okhttp3.Interceptor
import okhttp3.Response

class TokenInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        //Don't try this at home you should get token when sign in or register then save token and pass it in interceptor
        val sendToken = chain.request().newBuilder().header(
            "Authorization",
            "Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiJhZWExNjBkNjI5ODNlOTI0NTY5ZDdmZjJlNDFkMjY0YSIsIm5iZiI6MTcxOTg4ODY4NS43Njg1NTgsInN1YiI6IjY2M2ZmOWQ5NzM2MTM4NjA3ZDdlOTNiYyIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.29CjRmj5_aiYFR5ThPy3bOpIeKssbv5mqIM_YAyYIXs"
        ).build()
        return chain.proceed(sendToken)
    }
}