package com.jetbrains.handson.kmm.shared.network

import io.ktor.client.*
import io.ktor.client.engine.darwin.*

actual fun getHttpClient(): HttpClient {
    return HttpClient(Darwin) {
        engine {

        }
    }
}