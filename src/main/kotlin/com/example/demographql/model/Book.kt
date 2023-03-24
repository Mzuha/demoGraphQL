package com.example.demographql.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.util.UUID

@Entity
data class Book (
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id : UUID? = null,
    val name : String? = null,
    val description: String? = null
)