package com.example.app12024.activite3
fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8
    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)
    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")

    println("$firstNumber - $secondNumber = ${substract(firstNumber,secondNumber)}")
    println("$firstNumber - $thirdNumber = ${substract(firstNumber,thirdNumber)}")
}
// Define add() function below this line
fun add(a :Int, b:Int) : Int
{
    return a+b
}
// Define add() function below this line
fun substract(a :Int, b:Int) : Int
{
    return a-b
}