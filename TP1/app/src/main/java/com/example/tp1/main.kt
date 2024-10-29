package com.example.tp1

//declaration de niveau superieur
const val rocks=3
const val pi=3.14
fun main()
{
    var emp1=Employe("Ayman",19)
    var emp2=Employe("AKKA",18)

    emp1.printEmploye()
    emp2.printEmploye()

   // val foo = Constants.CONSTANT2
    //print(rocks+pi)
   // print(foo)/*

    /*val chaine = "Chaine exemple"
    if(chaine.hasSpaces())
    {
        println("Nous avons des espaces")
    }else
    {
        println("Makayanch des espaces")
    }
    val a :Int = 50
    println(a.exposant(3))*/
}
//Fonction d'extension
fun String.hasSpaces():Boolean{
    val found=this.find { it==' ' }
    return found != null
}
fun Int.exposant(n:Int):Int
{
    var res= this
    for(i in 2..n) {
        res = res * res
    }
    return res
}

fun calculerPI():Double
{
    return 22/7.toDouble()
}

class Employe(val name:String, age:Int){

    //MAX_AGE est une donnée statique
    companion object {
        const val MAX_AGE = 60
    }
    var age : Int = age
        set(value) {
            if(value > MAX_AGE)
                field = value
            else
            {
                print ("le max age est $MAX_AGE")
            }
        }

    fun printEmploye()
    {
        println("Le nom : $name l'age : $age")
    }
}
//AKKA = un seul objet de cette classe
//Singleton
object Constants{
    const val CONSTANT2= "Object constant"
}


fun Employe.printEmploye()
{
    println("Je m'appelle $name est j'ai $age")
}