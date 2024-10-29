package com.example.tp1.seals

open class AquariumPlant(val color : String,
    private val size:Int)
{
    open fun print() =println("AquariumPlant")

}
class GreenLeafyPlant(size:Int):AquariumPlant("green",size)
{
    override fun print() = println("GreenLeafyPlant")
}

fun main()
{
        /*val plant = GreenLeafyPlant(10)
        plant.print()
        println()
       val aquariumPlant : AquariumPlant = plant
        aquariumPlant.print()*/
   

}


