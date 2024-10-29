package com.example.app12024.activite5

//Parametre avec default value
fun swim(speed: String = "fast") {
    println("swimming $speed")
}
//Arguments obligatoires

fun shouldChangeWater (day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        temperature > 30 -> true
        dirty > 30 -> true
        day == "Sunday" -> true
        else -> false
    }
}
//Appels de la fonction
fun main()
{
    swim() // uses default speed
    //Passsage par position
    swim("slow") // positional argument
    //Passage par nom de parametre
    swim(speed="turtle-like") // named parameter
}