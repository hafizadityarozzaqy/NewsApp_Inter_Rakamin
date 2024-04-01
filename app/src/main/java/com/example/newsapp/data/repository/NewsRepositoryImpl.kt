package com.example.newsapp.data.repository

import arrow.core.Either
import com.example.newsapp.data.mapper.toNetworkError
import com.example.newsapp.data.remote.NewsApi
import com.example.newsapp.domain.model.NetworkError
import com.example.newsapp.domain.model.News
import com.example.newsapp.domain.repository.NewsRepository
import javax.inject.Inject

class NewsRepositoryImpl @Inject constructor (
    private val newsApi: NewsApi
) : NewsRepository {

    override suspend fun getNews(query: HashMap<String, Any>): Either<NetworkError, News> {
        return Either.catch {
            newsApi.getNews(query = query)
        }.mapLeft { it.toNetworkError() }
    }

    override suspend fun getHeadlines(query: HashMap<String, Any>): Either<NetworkError, News> {
        return Either.catch {
            newsApi.getHeadlines(query = query)
        }.mapLeft { it.toNetworkError() }
    }



}