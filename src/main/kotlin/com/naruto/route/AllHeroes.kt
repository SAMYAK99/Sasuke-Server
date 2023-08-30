package com.naruto.route

import com.naruto.models.ApiResponse
import com.naruto.repositories.HeroRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject


fun Route.getAllHeroes(){

    // Injecting Hero Repository Impl
    val heroRepository : HeroRepository by inject()

    get("/sasuke/heroes") {
       try {
           val page : Int = call.request.queryParameters["page"]?.toInt() ?: 1
           require(page in 1..5)
           val apiResponse = heroRepository.getAllHeroes(page = page)
           call.respond(
               message = apiResponse ,
               status = HttpStatusCode.OK
           )
       }catch (e : NumberFormatException){
           call.respond(
               message = ApiResponse(success = false , message = "Only Numbers Allowed.") ,
               status = HttpStatusCode.BadRequest
           )
       }catch (e : IllegalArgumentException){
           call.respond(
               message = ApiResponse(success = false , message = "Hereos Not Found (Range : 1-5)") ,
               status = HttpStatusCode.NotFound
           )
       }

    }
}