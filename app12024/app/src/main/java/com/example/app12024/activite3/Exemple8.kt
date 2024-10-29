package com.example.app12024.activite3


fun birthdayGreeting1(): String {
    val nameGreeting = "Happy Birthday, Rover!"
    val ageGreeting = "You are now 5 years old!"
    return "$nameGreeting\n$ageGreeting"
}

fun main()
{
    val message = birthdayGreeting1()
    println(message)
}