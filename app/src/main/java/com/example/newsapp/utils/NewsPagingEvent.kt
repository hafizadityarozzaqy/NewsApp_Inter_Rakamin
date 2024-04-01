package com.example.newsapp.utils

suspend fun sendEvent(event: Any) {
    EventBus.sendEvent(event)
}