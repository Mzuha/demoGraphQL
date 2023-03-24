package com.example.demographql.controller

import com.example.demographql.model.Book
import com.example.demographql.repository.BookRepository
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.MutationMapping
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class BooksController(
    private val bookRepository: BookRepository
) {

    @QueryMapping
    fun getBooks(): List<Book> = bookRepository.findAll()

    @QueryMapping
    fun getBooksByName(@Argument name : String) : List<Book> = bookRepository.findAllByName(name)

    @MutationMapping
    fun createBook(@Argument name: String, @Argument description: String): Book =
        bookRepository.save(
            Book(
                name = name,
                description = description
            )
        )

}
