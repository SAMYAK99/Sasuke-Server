package com.naruto.route

import com.naruto.repositories.HeroRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject


fun Route.searchHeroes(){

    // Injecting Hero Repository Impl
    val heroRepository : HeroRepository by inject()

    get("/sasuke/heroes/search") {

        val name = call.request.queryParameters["name"]
        val apiResponse = heroRepository.searchHeroes(name)
        call.respond(
            message = apiResponse ,
            status = HttpStatusCode.OK
        )
    }
}