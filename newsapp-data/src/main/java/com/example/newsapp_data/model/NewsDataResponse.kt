package com.example.newsapp_data.model

data class NewsDataResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)