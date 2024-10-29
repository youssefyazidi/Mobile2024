package com.example.tp1.seals

class Walrus : Seal()

fun main()
{
    var walrus: Walrus = Walrus()
    println (walrus)
}

//Un when optimal
fun matchSeal(seal : Seal): String
{
    return when(seal)
    {
        is Walrus -> "Walrus"
        is Sealion -> "Seal lion"
    }
}