package com.spring.kotlin

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class GreetingController {
    @GetMapping("/")
    fun redirectMain(model: Model): String {
        return "redirect:/hello"
    }

    @GetMapping("/hello")
    fun greetingG(model: Model): String {
        val calculator = CurrentTimeCalculator()
        var greeting = calculator.calculateTime()
        val test = "test"
        model.addAttribute("greeting", greeting)
        model.addAttribute("test", test)
        println(greeting)
        return "index"

    }
}