package com.example.myapplication.coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

var jeton =0
var i=0
fun main()
{
    GlobalScope.launch {

        while(i < 10)
        {
            ecrireMessage()
        }
    }

    GlobalScope.launch {

        while(i < 10)
        {
            lireMessage()
        }
    }

    println("Bonjour")
    Thread.sleep(6000)
    println("Nous avons $i appels des fonction")
}

suspend fun ecrireMessage()
{
        delay(500)
        jeton = i++
       println("Ecriture de valeur $jeton")
}
suspend fun lireMessage()
{
    delay(500)
    println("Lecture  de valeur $jeton")
}