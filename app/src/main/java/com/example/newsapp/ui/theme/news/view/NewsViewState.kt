package com.example.newsapp.ui.news.view

import androidx.compose.ui.focus.FocusRequester
import com.example.newsapp.R
import com.example.newsapp.utils.Endpoint

data class NewsViewState(
    val endpoint: Endpoint = Endpoint.EVERYTHING,
    val newsFocus: FocusRequester = FocusRequester(),
    val newsIcon: Int = R.drawable.solid_newspaper,
    val headlinesFocus: FocusRequester = FocusRequester(),
    val headlinesIcon: Int = R.drawable.fire_regular
)


