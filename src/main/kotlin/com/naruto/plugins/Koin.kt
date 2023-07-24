package com.naruto.plugins

import com.naruto.di.koinModule
import com.naruto.module
import io.ktor.http.*
import io.ktor.server.application.*
import org.koin.ktor.plugin.Koin
import org.koin.logger.slf4jLogger


@Suppress("unused")
fun Application.configureKoin(){
    install(Koin){
        slf4jLogger()
        modules(koinModule)
    }
}