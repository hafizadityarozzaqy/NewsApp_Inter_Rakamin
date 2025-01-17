package com.example.newsapp.domain.model

data class NetworkError(
    val error: ApiError,
    val t: Throwable?,
)

enum class ApiError(val message: String) {
    NetworkError("Network Error"),
    UnknownError("Unknown Error"),
    UnknownResponse("Unknown Response"),
}
