package com.example.app12024

fun main() {

    printBorder("@")
    println("Happy Birthday, Jhansi!")
    printBorder("@")
}

//declarer une fonction
fun printBorder() {
  //  println("=======================")
    repeat(23) {
        print("=")
    }
    println()
}
//surcharger la fonction
fun printBorder(border: String)
{
    repeat(23) {
        print(border)
    }
    println()
}
//surcharger la fonction
fun printBorder(border: String, times:Int)
{
    repeat(times) {
        print(border)
    }
    println()
}