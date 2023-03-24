package com.example.demographql.repository

import com.example.demographql.model.Book
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface BookRepository : JpaRepository<Book, UUID> {
    fun findAllByName(name : String) : List<Book>
}