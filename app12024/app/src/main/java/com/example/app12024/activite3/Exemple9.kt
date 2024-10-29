package com.example.app12024.activite3

fun birthdayGreeting2(name : String): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now 5 years old!"
    return "$nameGreeting\n$ageGreeting"
}

fun birthdayGreeting2(name : String, age:Int): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}

fun main()
{
    val message1 = birthdayGreeting2("Ahmed")
    //transmission de parametres par ordre (position)
    val message2 = birthdayGreeting2("Said",15)
    //transmission par nom de parametre
    val message3 = birthdayGreeting2(age = 20, name = "Aya")
    println(message1)
    println(message2)
    println(message3)
}