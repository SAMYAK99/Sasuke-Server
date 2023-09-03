package com.naruto.plugins

import com.naruto.route.getAllHeroes
import com.naruto.route.root
import com.naruto.route.searchHeroes
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*

fun Application.configureRouting() {
    routing {
        root()
        getAllHeroes()
        searchHeroes()
        staticResources(remotePath = "/images", basePackage = "images")
    }
}
