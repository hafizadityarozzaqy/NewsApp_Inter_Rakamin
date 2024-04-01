package com.example.newsapp.domain.repository

import arrow.core.Either
import com.example.newsapp.domain.model.NetworkError
import com.example.newsapp.domain.model.News

interface NewsRepository {

    suspend fun getNews(query: HashMap<String, Any>) : Either<NetworkError, News>

    suspend fun getHeadlines(query: HashMap<String, Any>) : Either<NetworkError, News>
}