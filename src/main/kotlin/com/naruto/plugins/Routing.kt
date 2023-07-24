package com.naruto.plugins

import com.naruto.route.getAllHeroes
import com.naruto.route.root
import com.naruto.route.searchHeroes
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*

fun Application.configureRouting() {
    routing {
        root()
        getAllHeroes()
        searchHeroes()
    }
}
