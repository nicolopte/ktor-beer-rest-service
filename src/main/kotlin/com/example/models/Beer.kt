package com.example.models

import java.util.*

data class Beer(
    val id: UUID = UUID.randomUUID(),
    val name: String,
    val type: String,
    val price: Int
)

data class BeerDTO(
    val name: String,
    val type: String,
    val price: Int
)
