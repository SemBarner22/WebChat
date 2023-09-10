package com.jetbrains.handson.kmm.shared.network

import io.ktor.client.*
import io.ktor.client.engine.java.*

actual fun getHttpClient() = HttpClient(Java) {
    engine {
        threadsCount = 8
        pipelining = true
        protocolVersion = java.net.http.HttpClient.Version.HTTP_2
    }
}