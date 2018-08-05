package com.github.mike.medina

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class ApplicationKt


fun main(args: Array<String>) {
    SpringApplication.run(ApplicationKt::class.java, *args)
}
