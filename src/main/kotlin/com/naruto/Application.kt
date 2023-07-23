package com.naruto

import io.ktor.server.application.*
import com.naruto.plugins.*

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused")
fun Application.module() {
    configureKoin()
    configureDefaultHeader()
    configureMonitoring()
    configureSerialization()
    configureRouting()
}
