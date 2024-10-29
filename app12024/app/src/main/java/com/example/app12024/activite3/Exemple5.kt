package com.example.app12024.activite3

//l'inference de type <=> typage dynamic
/*
fun main() {
    //Le compilateur détecte automatiquement le type

    //Pour ces déclaration : typage explicite
    val trip1: Double = 3.20
    val trip2: Double = 4.10
    val trip3: Double = 1.72

    val totalTripLength: Double = trip1 + trip2 + trip3

    println("$totalTripLength miles left to destination")
}*/

fun main() {
    //Le compilateur détecte automatiquement le type

    //Pour ces déclaration : typage implicite
    // => inference de type
    val trip1 = 3.20
    val trip2 = 4.10
    val trip3 = 1.72

    // inference de type pour les expressions
    val totalTripLength = trip1 + trip2 + trip3

    println("$totalTripLength miles left to destination")
}