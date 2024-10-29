package com.example.app12024.activite4

fun main()
{
    //Declaration de variable Int , affecter avec null
    // ?????? variable non nullable => Comportement par défaut
   // var rocks: Int = null

    //Forcer la variable a avoir la valeur null
    //variable nullable
    var rocks:Int? = null
   // rocks = 20

    //Safe Operator
    //rocks?.plus(5)

    //operateur d'assertion non null
    // => travailler avec le methode ancienne
    //rocks!!.plus(5)
    //println(rocks)

    var str1="maazouzi"
    var number:Double?=str1.toDoubleOrNull()
    number=number!!.plus(5.5)
    print(number)
}