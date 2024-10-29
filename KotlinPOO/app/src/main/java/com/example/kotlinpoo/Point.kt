package com.example.kotlinpoo

class Point (private val x:Int = 0, private val y:Int= 0){

    constructor(p:Point):this(p.x,p.y)
    {}

    fun printPoint()
    {
        println("P($x,$y)")
    }

    override fun toString(): String {
        return "P($x,$y)"
    }
}


fun main()
{
    var p1=Point()
    p1.printPoint()
    var p2=Point(2)
    p2.printPoint()
    var p3=Point(y=5)
    p3.printPoint()
    var p4=Point(11,17)
    p4.printPoint()
    /*
    var p5=Point(p4.x,p4.y)
    */
     var p5= Point(p4)
    p5.printPoint()
    var obj:Any
    var str="chaine : "+ p5
    println(str)
}