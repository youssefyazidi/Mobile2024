package com.example.tp1

import java.io.File

class Player(_name:String,
             var healthPoints:Int,
             val isBlessed:Boolean,
             private val isImmortal:Boolean){

    var name =_name
        get()="${field.uppercase()}"
        set(value)  {
            field=value.trim()
        }

    //Initialisation tardive qui s execute 1 seul fois lors d'acces
    //à la propriété
    val hometown:String by lazy {
        println("Initialisation de home town")
        selectHometown()
    }

    lateinit var alignment : String

    init {
        require(healthPoints>0,{"healthPoints doit étre supérieur à zéro."})
        require(name.isNotBlank(),{"le joueur doit avoir un nom."})
    }


     fun determineFate(){
         alignment = "Good"
     }

    fun proclaimFate()
    {
        if(::alignment.isInitialized)
         println(alignment)
    }

    fun castFireball(numFireballs:Int = 2)=
        println("Application d'un verre de Fireball. (x$numFireballs)")


    /*Constructeur secondaire*/
    constructor(name:String):
            this(name,healthPoints = 100,isBlessed=true,isImmortal=false)
    /* fonction membre*/
    fun auraColor():String{
        val auraVisible=isBlessed && healthPoints > 50 || isImmortal
        val auraColor=if(auraVisible)"VERTE" else "AUCUNE"
        return auraColor
    }
    fun formatHealthStatus()=
        when (healthPoints){
            100 -> "est en parfaite condition!"
            in 90..99 -> "a quelques égratignures."
            in 75..89 -> if (isBlessed) {
                "a quelques blessures mineures,mais se rétablit vite !"
            } else
            {"a quelques blessures mineures"
            }
            in 15..74 -> "semble assez mal en point."
            else -> "est dans une condition épouvantable !"
        }

    //finction membre privée
   private fun selectHometown():String{
       val file = File("town.txt")
       val nom = file.readText().split(";").shuffled().first()
        return nom
    }
}
fun main (){

    //C est le constructeur secondaire
    /*val p1=Player("madrigal")
   printPlayerStatus(p1)*/

    val p2=Player("MAAZOUZ",70,false,false)
    p2.healthPoints = 150
    printPlayerStatus(p2)
    println(p2.hometown)
    println(p2.hometown)
    println(p2.hometown)
  /*  val p3=Player("SAID",150,false,false)
    printPlayerStatus(p3)
    println(p3.hometown)
    println(p3.hometown)
    p3.determineFate()
    p3.proclaimFate()*/

    //val list = listOf(1,3,5,4)
    //list.sum

}

fun printPlayerStatus(player:Player){
    println(("(Aura : ${player.auraColor()})" + "(Béni : ${if (player.isBlessed) "OUI"  else "NON"})"))
    println("${player.name} ${player.formatHealthStatus()}")
}