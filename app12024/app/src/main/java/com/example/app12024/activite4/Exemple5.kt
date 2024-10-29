package com.example.app12024.activite4

fun main()
{
    //Liste non modifiable
    //On peut pas ajouter ni supprimer ni modifier
    //Initialiser avec ses données
    var list= listOf("mackerel", "trout", "halibut")

    //parcours avec index
  /*  for (i in 0..2)
    {
        println(list[i])
    }*/
    //parcours avec iteration
    for(element in list)
    {
        println(element)
    }
   // println(list)
}