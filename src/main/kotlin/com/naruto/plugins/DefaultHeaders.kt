package com.naruto.plugins

import io.ktor.server.application.*
import io.ktor.server.plugins.defaultheaders.*
import java.time.Duration
import io.ktor.http.*


/*
* Configuring Default Headers for Caching the data everytime we send a request
* */

@Suppress("unused")
fun Application.configureDefaultHeader() {
    install(DefaultHeaders) {
        val oneYearInSeconds = Duration.ofDays(365).seconds
        header(name = HttpHeaders.CacheControl, value = "public, max-age=$oneYearInSeconds, immutable")
    }
}