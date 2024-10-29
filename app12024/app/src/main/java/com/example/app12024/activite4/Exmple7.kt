package com.example.app12024.activite4

import android.os.Build
import java.util.Objects
import kotlin.reflect.typeOf


fun main()
{
    //Le type Array<String>
    val school = arrayOf("shark", "salmon", "minnow")
   // println(java.util.Arrays.toString(school))


    val numbers = intArrayOf(1,2,3)
    val numbers3 = intArrayOf(4,5,6)

    //Concatenation de tableau
    val foo2 = numbers3 + numbers
    println(foo2[5])

    val mix1 = arrayOf("fish", 2)
    val mix2 = arrayOf(5.0, 2)
    for (element in school)
    {
        println(element)
    }
    mix1[0]= "test"
    //mix2[0]= "test"
    println(java.util.Arrays.toString(mix1))

}