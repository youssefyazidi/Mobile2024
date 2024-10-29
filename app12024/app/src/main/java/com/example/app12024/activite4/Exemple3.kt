package com.example.app12024.activite4

fun main()
{
    var numberOfFish=50
    //Exprimer le Selon => vérifier l'expression avec les conditions
    when (numberOfFish) {

        0 -> println("Empty tank")

        in 1..39 -> println("Got fish!")

        else -> println("That's a lot of fish!")
    }
}