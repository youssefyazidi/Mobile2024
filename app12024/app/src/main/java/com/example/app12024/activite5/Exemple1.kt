package com.example.app12024.activite5
import java.util.Random

fun main()
{
    feedTheFish()
}
fun feedTheFish() {

    //Appel de la fonction randomDay()
    val day = randomDay()
    val food = "pellets"
    println ("Today is $day and the fish eat $food")
}
//Renvoyer un jour de la semaine aleatoirement
fun randomDay() : String {
    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    //Retourner une valeur aleatoire + nextInt(intervalle)
    val random = Random()//random = new Random()
    return week[random.nextInt(week.size)]
}