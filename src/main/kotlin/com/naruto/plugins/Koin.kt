package com.naruto.plugins

import io.ktor.http.*
import io.ktor.server.application.*
import org.koin.ktor.plugin.Koin
import org.koin.logger.slf4jLogger


@Suppress("unused")
fun Application.configureKoin(){
    install(Koin){
        slf4jLogger()
    }
}