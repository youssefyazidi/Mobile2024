package com.example.myapplication.coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main()
{
    runBlocking {
        val job1 = launch {
            delay(3000)
            println("Le job1 est lancée")
        }

        job1.invokeOnCompletion {
            println("Le job1 est terminé")
        }

        delay(500)
        println("Le job 1 va etre annulé")
        job1.cancel()
    }

    
}