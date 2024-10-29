package com.example.app12024.activite4

fun main()
{
    //Liste modifiable
    //Inference de type
    val myList = mutableListOf("tuna", "salmon", "shark")
    //Spécifier le type de la liste
    val mylist2= mutableListOf<Int>()
    val myList3 = mutableListOf(5,2,3)
    //val myList4= mutableListOf<Any>()
    //Supprimer un element
    myList.remove("shark")
    println(myList)
    //Ajouter un élément
    myList.add("Dolphin")
    println(myList)

    //Modifier d'un élement
    myList[1]="shark"
    myList.add(7.toString())
    println(myList)
    println(mylist2)
    println(myList3)

}