package com.example.newsapp_data.repository

import com.example.newsapp_data.network.NetworkRequest
import retrofit2.Response

class NetworkService(private val mNetworkRequest: NetworkRequest) {

    suspend fun getNewsDataFromApi() =
        this@NetworkService.wrapResponseToCallStatus(mNetworkRequest.getNewsDataFromApi())


    private fun <T> wrapResponseToCallStatus(networkCallResult: Response<T>) =
        networkCallResult.run {
            if (this@run.isSuccessful) {
                NetworkCallStatus.Success(data = this@run.body())
            } else {
                NetworkCallStatus.Error(
                    message = "${this@run.code()} : ${
                        this@run.errorBody()?.toString()
                    }"
                )
            }
        }


//    private fun <T> getParseApiResponse(networkCallResult: Response<T>) =
//        networkCallResult.runCatching {
//            when {
//                this@runCatching.isSuccessful -> NetworkCallStatus.Success(data = this@runCatching.body())
//                else -> {
//                    val errorResponse = try {
//                        Gson().fromJson(
//                            this@runCatching.errorBody()?.charStream()?.readText(),
//                            ErrorResponse::class.java
//                        )
//                    } catch (e: Exception) {
//                        null
//                    }
//                    NetworkCallStatus.Error(message = errorResponse?.errors?.reason)
//                }
//            }
//        }.getOrThrow()

//    private fun <Void> parseVoidApiResponse(networkCallResult : Response<Void>) =
//        networkCallResult.runCatching {
//            if (this@runCatching.isSuccessful){
//                NetworkCallStatus.Success(ApiResponse())
//            }
//        }
}