package com.example.newsapp_data.repository

sealed class NetworkCallStatus<out T>(
    val data: T? = null,
    val message: String? = null) {

    class Success<T>(data: T) : NetworkCallStatus<T>(data)
    class Error<T>(data: T? = null, message: String?) : NetworkCallStatus<T>(data, message)
    class Loading<T>() : NetworkCallStatus<T>()
}