package com.example.myapplication.threads

class MonThread : Thread() {

    override fun run() {
        super.run()
        for (i in 1..10) {
            println("Execution de Thread " + this.name +" i=$i")
            Thread.sleep(1000)
        }
    }
}