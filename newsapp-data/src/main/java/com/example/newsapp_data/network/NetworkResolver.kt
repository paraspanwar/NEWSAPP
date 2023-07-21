package com.example.newsapp_data.network

import android.annotation.SuppressLint
import android.content.Context
import com.example.newsapp_data.datautils.DataConstant
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@SuppressLint("StaticFieldLeak")
object NetworkResolver {

    private lateinit var mContext: Context
    private const val baseUrl = DataConstant.GET_TODAY_NEWS_DATA

    private val retrofitService by lazy {
        Retrofit.Builder().baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            // we need to add converter factory to
            // convert JSON object to Java object
            .build()
            .create(NetworkRequest::class.java)
    }


    fun getNetworkInstance(mContext: Context): NetworkRequest {
        this.mContext = mContext
        return retrofitService
    }
}
