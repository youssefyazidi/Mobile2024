package com.example.tp1.nulls

import java.io.File

/*
fun main()
{
    //Declaration avec affectation
    // non null String
    //var nomEquipe : String = "Itihad Tanger"
    //attribuer le null à nomEquipe
    //nomEquipe = null

    var nomEquipe : String? = "Itihad Tanger"
    nomEquipe = null
    println ("Hello $nomEquipe")
   /* val reader = BufferedReader(
        FileReader("log.txt")
    )
    var row:String = reader.readLine()
    while (row!=null)
    {
        println(row)
        row=reader.readLine()
    }
    reader.close();*/

}*/

fun main()
{
    /*println("Siasir un nom d'equipe : ")
    var nomEquipe  = readLine()?.replace(" ","//")
    println("Le nom saisi est : $nomEquipe")*/

    /*println("Siasir un nom d'equipe : ")
    var nomEquipe  = readLine()?.let {
        if(it.isNotBlank())
        {
            it.uppercase()
        }
        else {
            "Itihad Tanger"
        }
    }
    println("Le nom saisi est : $nomEquipe")*/

    /*var nomEquipe : String? = "Itihad Tanger"
    nomEquipe =null
    var l = nomEquipe?.replace(" ","//")
    println ("Hello $nomEquipe $l")*/

    /*var nomEquipe : String? = "Itihad Tanger"
    nomEquipe =null
    try {

        var l = nomEquipe!!.replace(" ", "//")
        println("Hello $nomEquipe $l")
    }
    catch(ex:Exception)
    {
        println(" probleme de null")
    }*/
/*
    println("Siasir un nom d'equipe : ")
    try {
        var nomEquipe  = readLine()!!.replace(" ","//")
        println("Le nom saisi est : $nomEquipe")
    }
   catch(e: Exception)
   {
       println("probleme de saisie")
   }*/

    println("Siasir un nom d'equipe : ")

    var nomEquipe  = readLine()
    if(nomEquipe != null) {
        nomEquipe.replace(" ", "//")
        println("Le nom saisi est : $nomEquipe")
    }
    else {
        println("probleme de saisie")
    }
}