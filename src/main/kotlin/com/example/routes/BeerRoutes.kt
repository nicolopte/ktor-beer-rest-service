package com.example.routes

import com.example.controllers.BeerController
import com.example.models.BeerDTO
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.request.*
import io.ktor.response.*
import io.ktor.routing.*

fun Route.beerRouting() {
    val beerController = BeerController();

    route("/beers") {
        post {
            val beerDTO = call.receive<BeerDTO>()
            beerController.insert(beerDTO)
            call.respond(HttpStatusCode.Created)
        }
    }
}

fun Application.registerBeerRoutes() {
    routing {
        beerRouting()
    }
}