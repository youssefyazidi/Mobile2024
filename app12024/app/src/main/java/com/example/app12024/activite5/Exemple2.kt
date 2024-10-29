package com.example.app12024.activite5

import java.util.Random
//Ecritures du When
/*fun fishFood (day : String) : String {
    var food = ""
    when (day) {
        "Monday" -> food = "flakes"
        "Tuesday" -> food = "pellets"
        "Wednesday" -> food = "redworms"
        "Thursday" -> food = "granules"
        "Friday" -> food = "mosquitoes"
        "Saturday" -> food = "lettuce"
        "Sunday" -> food = "plankton"
    }
    return food
}*/
fun fishFood (day : String) : String {
    return when (day) {
        "Monday" -> "flakes"
        "Tuesday" ->  "pellets"
        "Wednesday" ->  "redworms"
        "Thursday" ->  "granules"
        "Friday" -> "mosquitoes"
        else -> "Nothing"
    }
}
fun feedTheFish1() {
    //Appel de la fonction randomDay()
    val day = randomDay1()
    val food = fishFood(day)
    println ("Today is $day and the fish eat $food")
    //day un parametre obligatoire
    println("Change water: ${shouldChangeWater1(day,50)}")
    //Passage par position
    println("Change water t=50 d=18: ${shouldChangeWater(day,50,18)}")
    //passage par nom
    println("Change water d=15: ${shouldChangeWater(day, dirty = 15)}")
}
//Renvoyer un jour de la semaine aleatoirement
fun randomDay1() : String {
    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    //Retourner une valeur aleatoire + nextInt(intervalle)
    val random = Random()//random = new Random()
    return week[random.nextInt(week.size)]
}
fun main()
{
    feedTheFish1()
}