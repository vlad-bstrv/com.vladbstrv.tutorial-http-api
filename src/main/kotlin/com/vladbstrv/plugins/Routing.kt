package com.vladbstrv.plugins

import com.vladbstrv.routers.customerRouting
import com.vladbstrv.routers.getOrderRoute
import com.vladbstrv.routers.listOrderRoute
import com.vladbstrv.routers.totalizeOrderRoute
import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*

fun Application.configureRouting() {

    routing {
        get("/") {
            call.respondText("Hello World!")
        }
        customerRouting()
        listOrderRoute()
        getOrderRoute()
        totalizeOrderRoute()
    }
}
