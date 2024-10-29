package com.example.app12024.activite5

val decorations =
    listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

fun main()
{
    //Utilisation des filtres -
    // un filtre renvoi une sous liste dont les elements reponndent à la condition

    println(decorations.filter{ it.length == 6 })

    println(decorations.filter{ it[0] == 'f' })

    println(decorations.filter{ it[0] == 'p' })
}