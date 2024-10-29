package com.example.tp1.lambdas

class Personne (val nom:String, val age:Int) :
    Comparable<Personne>{

    override fun compareTo(other: Personne): Int {
        return when {
            this.age > other.age    ->  1
            this.age < other.age    -> -1
            else                    ->  0
        }
    }
}

fun main()
{
    val p1= Personne("MAZOUZ",20)
    val p2= Personne("AYMAN",20)

    println(p1 > p2)
    println(p1 < p2)
    println(p1 >= p2)
}