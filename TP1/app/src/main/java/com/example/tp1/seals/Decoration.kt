package com.example.tp1.seals

//Enumeration avec un champs entier
enum class Color(val rgb : Int)
{
  RED(0xFF0000),GREEN(0x00FF00),BLUE(0x0000FF),BLACK(0x000000)
    ,WHITE(0xFFFFFF)
}
//Créer une enumération de jours => un nouveau type
enum class Jour{
    Lundi,Mardi,Mercredi,Jeudi,Vendredi,Samedi,Dimanche
}

@OptIn(ExperimentalStdlibApi::class)
fun main()
{
    //Variable de type Jour
    // => ne peut avoir que une valeur parmis les valeurs de l'enumeration
    var day: Jour
    day = Jour.Lundi
    println(day)

    var color : Color
    color = Color.BLACK
    println("$color  ${color.rgb.toHexString()}")
    println("$color  ${color.name}  ${color.ordinal}")
}