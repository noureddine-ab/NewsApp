package com.example.newsnow

import androidx.lifecycle.ViewModel
import com.kwabenaberko.newsapilib.NewsApiClient

class NewsViewModel:ViewModel (){

    fun fetchTopHeadlines() {
        val newsApiClient = NewsApiClient(Constant.apiKey)
    }

}