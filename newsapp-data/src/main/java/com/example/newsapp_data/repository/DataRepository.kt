package com.example.newsapp_data.repository

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow

class DataRepository(
    private val mNetworkService: NetworkService,
    private val mCoroutineDispatcher: CoroutineDispatcher) {

    suspend fun getNewsDataFromApi() = flow {
        emit(NetworkCallStatus.Loading())
        emit(mNetworkService.getNewsDataFromApi())
    }.catch {
        this.emit(NetworkCallStatus.Error(message = it.message, data = null))
    }
}