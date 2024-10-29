package com.example.app12024.activite4


fun main() {
    //Code initialisateur
    val array = Array(5){
        it * 2
    }
    println(java.util.Arrays.toString(array))

    //Parcourir le tableau avec seulement avec les element
    for (element in array) {
        println("Item : $element\n")
    }
    //Parcourir le tableau avec les index
    for ((index, element) in array.withIndex()) {
        println("Item at $index is $element\n")
    }
}