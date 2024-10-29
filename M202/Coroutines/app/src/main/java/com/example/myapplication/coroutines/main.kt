package com.example.myapplication.coroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

fun main()
{
        println("l'execution du programme va se bloquer")
        runBlocking {
            launch {
                delay(1000)
                println("Tache de runblocking ${Thread.currentThread()}")
            }
            //Creer un cotoutines = Thread lèger
            GlobalScope.launch {
                delay(500)
                println("Tache du scope globale ${Thread.currentThread()}")
            }
            coroutineScope {
               withContext(Dispatchers.Default,{
                    delay(1500)
                    println("Tache de coroutineScope ${Thread.currentThread()}")
                })
            }

        }
        println("l'execution du programme va se poursuivre")
}