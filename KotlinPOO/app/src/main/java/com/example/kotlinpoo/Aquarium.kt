package com.example.kotlinpoo

import android.annotation.SuppressLint

/****************implementation 1****************/
/*class Aquarium {

    //des propriètès
    var width :Int = 20
    var height :Int = 40
    var length : Int = 100

    //methodes
    fun printSize()
    {
        println("Width : $width cm Length : $length cm "+
                "Height : $height cm")
    }
}*/
/********************************/
/****************implementation 2****************/
/*class Aquarium (length:Int, width:Int, height:Int){

    //des propriètès
    var width :Int = width
    var height :Int = height
    var length : Int = length

    //methodes
    fun printSize()
    {
        println("Width : $width cm Length : $length cm "+
        "Height : $height cm")
    }
}*/
/**************************************************/
/****************implementation 3****************/
/*class Aquarium (length:Int=100, width:Int=20, height:Int=40){

    //des propriètès
    var width :Int = width
    var height :Int = height
    var length : Int = length

    //methodes
    fun printSize()
    {
        println("Width : $width cm Length : $length cm "+
        "Height : $height cm")
    }
}*/
/**************************************************/
/****************implementation 4****************/
/*class Aquarium (var length:Int=100, var width:Int=20, var height:Int=40){

    //Les blocs init s'executent dans l'ordre dans lequel ils apparaissent
    //dans la classe.
    init {
        println("Aquarium initializing...")
    }

    init {
        println("Volume : ${width * height * length/1000} l")
    }
    //methodes
    fun printSize()
    {
        println("Width : $width cm Length : $length cm "+
                "Height : $height cm")
    }
}*/
/**************************************************/

/****************implementation 5****************/
/*class Aquarium (var length:Int=100, var width:Int=20, var height:Int=40){

    //Les blocs init s'executent dans l'ordre dans lequel ils apparaissent
    //dans la classe.
    init {
        println("Aquarium initializing...")
    }

    init {
        println("Volume : ${width * height * length/1000} l")
    }
    //Ajouter un constructeur secondaire
    constructor(numberOfFish: Int):this()
    {
        val tank = numberOfFish * 2000 * 1.1
        height = (tank/(width*length)).toInt()
    }
    //methodes
    fun printSize()
    {
        println("Width : $width cm Length : $length cm "+
                "Height : $height cm")
    }
}*/
/**************************************************/

/****************implementation 6****************/

///Supposant nous voulons des aquarium avec
// un width, length et un height inmodifiables
/*class Aquarium (val length:Int=100, val width:Int=20, height:Int=40){
    //Les blocs init s'executent dans l'ordre dans lequel ils apparaissent
    //dans la classe.
    //Un set personnalisé
     var height :Int =height
        private set(value) {
            if(value > 0)
            field =value
        }

    //Un get personnalisé
    val volume : Int
         get() = width * height * length/1000

    init {
        println("Aquarium initializing...")
    }

    init {
        println("Volume : ${width * height * length/1000} l")
    }
    //Ajouter un constructeur secondaire
    constructor(numberOfFish: Int):this()
    {
        val tank = numberOfFish * 2000 * 1.1
        height = (tank/(width*length)).toInt()
    }
    //methodes
    fun printSize()
    {
        println("Width : $width cm Length : $length cm "+
                "Height : $height cm")
    }
}*/
/**************************************************/

/*********************Implementation 7**************/
open class Aquarium (open var length:Int=100,open var width:Int=20,open var height:Int=40) {

    open var volume :Int
        get() = width*height*length/1000
        set(value) {
            height =(value * 1000)/(width*height)
        }

    open val shape= "rectangle"

    //pte calculée
    open var water = 0.0
        get() = volume * 0.9

    //methodes
    fun printSize()
    {
        println(shape)
        println("Width : $width cm Length : $length cm "+
                "Height : $height cm")
        println("Volume $volume l Water: $water l (${water/volume*100.0})% full ")
    }
}

class TowerTank(override var height: Int,var diametre : Int):
    Aquarium(height =height, width = diametre, length = diametre)
    {
        //Redéfinir le shape
        override val shape: String = "Cylindre"

        //Redéfinir le volume
        override var volume: Int
            get() = ((diametre/2*diametre/2*Math.PI*height)/1000).toInt()
            set(value) {
                height = ((value*1000/Math.PI)/(diametre/2*diametre/2)).toInt()
            }

        //Redéfinir le water
        override var water: Double = 0.0
            get() = volume * 0.8
    }