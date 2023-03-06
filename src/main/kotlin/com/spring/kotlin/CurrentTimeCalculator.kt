package com.spring.kotlin

import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

class CurrentTimeCalculator {

    fun calculateTime() : String {

        val torontoZoneId = ZoneId.of("America/Toronto")
        val torontoTime = ZonedDateTime.now(torontoZoneId)
        val dateFormatter = DateTimeFormatter.ofPattern("MM-dd-YYYY HH:mm a z")
        val timeFormatted = dateFormatter.format(torontoTime)
        val name = "Fabian"
        val course = "COMP367"
        val morningGreeting = "Good Morning"
        val afternoonGreeting = "Good Afternoon"
        val eveningGreeting = "Good Evening"
        val nightGreeting = "Good Night"
        var greeting = ""



        if (torontoTime.hour in 1..12)
            greeting = "$morningGreeting $name, Welcome to $course. The current time is: $timeFormatted"

        if (torontoTime.hour in 13..16)
            greeting = "$afternoonGreeting $name, Welcome to $course. The current time is: $timeFormatted"

        if (torontoTime.hour in 16..21)
            greeting = "$eveningGreeting $name, Welcome to $course. The current time is: $timeFormatted"

        if (torontoTime.hour in 22..24)
            greeting = "$morningGreeting $name, Welcome to $course. The current time is: $timeFormatted"

        println("calculate executed" + greeting)
        return greeting
    }
}