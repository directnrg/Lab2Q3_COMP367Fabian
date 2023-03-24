package com.spring.kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Application
fun main(args: Array<String>) {
    runApplication<Application>(*args)
    println("Application started...")

    val calculator = CurrentTimeCalculator()
    var greeting = calculator.calculateTime()

    println(greeting)
}