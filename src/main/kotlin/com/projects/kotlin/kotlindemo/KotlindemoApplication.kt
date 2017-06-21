package com.projects.kotlin.kotlindemo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class KotlindemoApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotlindemoApplication::class.java, *args)
}
