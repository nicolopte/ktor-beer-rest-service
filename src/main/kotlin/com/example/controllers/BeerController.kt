package com.example.controllers

import com.example.models.BeerDTO
import com.example.repositories.Beers
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.transactions.transaction
import java.util.*

class BeerController {

    fun insert(beer: BeerDTO) {
        transaction {
            Beers.insert {
                it[id] = UUID.randomUUID()
                it[name] = beer.name
                it[type] = beer.type
                it[price] = beer.price
            }
        }
    }
}