package com.example.tp1.checks
/*
fun main()
{
    val obj : Any = "message"

    //Transtypage = conversion de type = cast
    val str= obj as String

    println(str.length)
}*/
/*
fun main()
{
    val obj : Any? = null

    //Transtypage = conversion de type = cast
    val str= obj as String?

    println(str)
}*/
/*
fun main()
{
    val obj :Any = 123
    val str : String = obj as String
    println (str)
}*/
/*
//cast safe (as?) = pas d'erreur d'execution
fun main()
{
    val obj :Any = "Message a convertir"
    val safeStr : String? = obj as? String
    //l'operateur renvoi null si la conversion n'est pas valable
    val safeInt : Int? = obj as? Int
    println (safeStr)
    println (safeInt)
}*/


typealias Entier = Int
typealias Predicate<T> = (T)->Boolean

fun foo(p:Predicate<Int>)
{
    println(p(25))
}

fun main()
{
    val f1 : Predicate<Int> ={it > 0}
    foo(f1)

    val f2 : Predicate<Int> ={it < 0}
    foo(f2)

    val f3 :Predicate<Double> = {it >0}
}