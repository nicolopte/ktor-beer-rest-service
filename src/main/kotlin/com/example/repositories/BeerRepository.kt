package com.example.repositories

import org.jetbrains.exposed.sql.Table

object Beers : Table() {
    val id = uuid("id").primaryKey()
    val name = text("name")
    val type = text("type")
    val price = integer("price")
}