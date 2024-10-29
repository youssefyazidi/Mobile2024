package com.example.tp1.checks

fun String.myplus1(other : String) = this + other

val myplus2 = fun String.(other : String) = this + other

var myplus3 : String.(String)->String ={
    this +it
}
fun main()
{
    println ("A".myplus1("B"))
/*
    println ("A".myplus2("B"))
    println (myplus2("A","B"))
    println(myplus2.invoke("A","B"))*/

    println ("A".myplus3("B"))
    println (myplus3("A","B"))
    println(myplus3.invoke("A","B"))
}