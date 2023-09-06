package com.kirenraj

import android.app.Application
import com.kirenraj.data.repo.NewsRepo
import com.kirenraj.data.retrofit.NewsApi
import com.kirenraj.data.retrofit.RetrofitHelper

class MyApplication: Application() {
    lateinit var newsRepo: NewsRepo

    override fun onCreate() {
        super.onCreate()

        val api = RetrofitHelper.getInstance().create(NewsApi::class.java)
        newsRepo = NewsRepo(api)
    }
}