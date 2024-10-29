package com.example.app12024.activite4

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

enum class Categorie {

    LOURD, LEGER, REMPLISSAGE

}



data class Material (val categorie: Categorie)



infix fun Material.compatibleAvec(other: Material) : Boolean {

    return this.categorie == Categorie.LEGER || other.categorie == Categorie.REMPLISSAGE;

}


fun main() {

    val mat1 = Material(Categorie.LOURD)

    val mat2 = Material(Categorie.LEGER)

    // utiliser mat1 et mat2
   println( mat1 compatibleAvec mat2 )

    var x:Int?=null
    println(x!!)
}
