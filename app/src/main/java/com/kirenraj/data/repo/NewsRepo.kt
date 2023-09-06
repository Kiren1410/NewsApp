package com.kirenraj.data.repo

import com.kirenraj.data.model.Article
import com.kirenraj.data.retrofit.NewsApi


class NewsRepo(
    private val newsApi: NewsApi
) {
    suspend fun getNews(): List<Article> {
        return newsApi.getNews("us", "sports", "46c8cae3a46643349ac2b1cd524f5782").articles
    }

}