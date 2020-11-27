package com.sabamiso.bookkotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BookKotlinApplication

fun main(args: Array<String>) {
    runApplication<BookKotlinApplication>(*args)
}
