package com.example.newsapp_data.network

import com.example.newsapp_data.datautils.DataConstant
import com.example.newsapp_data.model.NewsDataResponse
import retrofit2.Response
import retrofit2.http.GET

interface NetworkRequest {

    @GET(DataConstant.GET_TODAY_NEWS_DATA)
    suspend fun getNewsDataFromApi(): Response<NewsDataResponse>

}