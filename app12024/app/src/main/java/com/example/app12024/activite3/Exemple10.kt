package com.example.app12024.activite3

//Parametre avec valeur par défaut
fun birthdayGreeting3(name : String = "Rover", age:Int): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}

fun main() {

    //Appel de la fonction + specifier les arguments (2)
    val message1 = birthdayGreeting3("Said", 15)
    println(message1)

    //Appel de la fonction + specifier 1 argument
    //Le passage per nom de parametre obligatoire
    val message2 = birthdayGreeting3(age = 20)
    println(message2)
}