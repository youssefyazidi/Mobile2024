package com.example.app12024.activite5

//Focntions Compacts
fun isTooHot(temperature: Int) = temperature > 30

/*fun isTooHot(temperature : Int):Boolean{
    return temperature > 30
}*/
fun isDirty(dirty: Int) = dirty > 30
fun isSunday(day: String) = day == "Sunday"

fun shouldChangeWater1 (day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}