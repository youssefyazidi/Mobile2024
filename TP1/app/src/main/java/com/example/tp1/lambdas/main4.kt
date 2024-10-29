package com.example.tp1.lambdas


//fonction d'extension
operator fun Int.invoke()
{
    println(this)
}
/*
fun main()
{
    7()
    11()
}*/

class Invokable{
    var numberOfInvocation =0
        private set

    operator fun invoke(): Invokable{
        numberOfInvocation++
        return this
    }
}

fun invokeTwice(invocable:Invokable)=invocable()()

fun main()
{
    var invokable = Invokable();
    invokeTwice(invokable);
    println(invokable.numberOfInvocation)
}
