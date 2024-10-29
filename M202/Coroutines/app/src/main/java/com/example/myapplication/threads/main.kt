package com.example.myapplication.threads

/*
fun main()
{

    val t1 = MonThread()
    val t2= MonThread()

    //Lancer les threads
    t1.start()
    t2.start()
}
 */
/*
fun main()
{

    val t1 = Thread(Runnable {
        for (i in 1..10) {
            println("Execution de Thread " + Thread.currentThread() +" i=$i")
            Thread.sleep(1000)
        }
    })

    val t2 = Thread(Runnable {
        for (i in 1..10) {
            println("Execution de Thread " + Thread.currentThread() +" i=$i")
            Thread.sleep(1000)
        }
    })
    //Lancer les threads
    t1.start()
    t2.start()
}*/
/*
fun main()
{

    val t1 = Thread {
        for (i in 1..10) {
            println("Execution de Thread " + Thread.currentThread() +" i=$i")
            Thread.sleep(1000)
        }
    }

    val t2 = Thread{
        for (i in 1..10) {
            println("Execution de Thread " + Thread.currentThread() +" i=$i")
            Thread.sleep(1000)
        }
    }
    //Lancer les threads
    t1.start()
    t2.start()
}*/

fun main()
{
 val states= arrayOf("Starting","Doing task 1","Doing task 2","Ending")
    repeat(3)
    {
        Thread {
            println("Execution de Thread " + Thread.currentThread())
            for (i in states) {
                println("${Thread.currentThread()} - $i")
                Thread.sleep(1000)
            }
        }.start()
    }

}

