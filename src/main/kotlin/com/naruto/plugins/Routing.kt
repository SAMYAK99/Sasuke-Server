package com.naruto.plugins

import com.naruto.route.getAllHeroes
import com.naruto.route.root
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*

fun Application.configureRouting() {
    routing {
        root()
        getAllHeroes()
    }
}
