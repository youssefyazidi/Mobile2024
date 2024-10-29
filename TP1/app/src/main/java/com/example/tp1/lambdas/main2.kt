package com.example.tp1.lambdas
/*
val gretting = {

    playerName : String, numBuildings: Int ->
    val currentYear =2020

    println ("Ajout de $numBuildings maisons")
    "Bienvenu a SimVillage, $playerName !  (Copyright $currentYear)"
}

val printNomEtAge ={
    nom:String, age: Int ->
    "Je m'appelle $nom et j ai $age"
}
fun main()
{
       /* println (gretting("MAZZOUZ", 20))
    println (gretting("AKKA", 40))*/

    runSimulation("MAZOUZ",gretting)
    runSimulation("AKKA", printNomEtAge)
}

//La fonction runSimilation

fun runSimulation(palyerName : String, grettingFunction : (String,Int)->String)
{
    var numBuildings = (1..3).shuffled().first()
    println(grettingFunction(palyerName,numBuildings))
}
*/
var list = listOf(0,2,-5,7,0,-9,10)
inline fun rechercher(list: List<Int>,predicate : (Int)-> Boolean): Int
{
    var count =0
    for (n in list)
    {
        if(predicate(n))
        {
            count++
        }
    }
    return count
}

fun main()
{
   /* val criterePositf={
        p: Int -> p>0
    }
    val critereNegatif={
            p: Int -> p<0
    }*/
    /* println(rechercher(list, criterePositf))
     println(rechercher(list,critereNegatif))
     println(rechercher(list,{p->p==0}))*/

   /* println(rechercher(list, { p-> p>0} ))
    println(rechercher(list,{p->p<0}))
    println(rechercher(list,{p->p==0}))*/

   /* println(rechercher(list, { it>0} ))
    println(rechercher(list,{it<0}))
    println(rechercher(list,{it==0}))*/

    println(rechercher(list) {
        it>0
    }
    )
    println(rechercher(list){
        it<0
    }
    )
    println(rechercher(list){
        it==0
    }
    )
}