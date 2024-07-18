package com.architect.kmpnavigation

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform