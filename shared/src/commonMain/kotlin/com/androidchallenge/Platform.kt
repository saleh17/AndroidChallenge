package com.androidchallenge

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform