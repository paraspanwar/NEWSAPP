package com.example.newsapp_data.model

import com.google.gson.annotations.SerializedName


data class ErrorResponse(@SerializedName("error") var errors: Errors? = Errors())

data class Errors(
    @SerializedName("code") var code: String? = null,
    @SerializedName("reason") var reason: String? = null,
    @SerializedName("rootCauses") var rootCauses: String? = null,
    @SerializedName("datetime") var datetime: String? = null
)