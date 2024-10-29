package com.example.tp1.lambdas

import androidx.annotation.OpenForTesting


class LazyProperty(val initializer:() -> Int)
{
      private var value :Int?=null
      val lazy:Int
      get()
      {
          if(value == null)
          {
              value= initializer()
          }
              return value!!
      }
}
fun main()
{
    val l=LazyProperty({
        println("Initialisation de propriété")
        (1..50).shuffled().first()
    })
    println(l.lazy)
    println(l.lazy)
    println(l.lazy)
}