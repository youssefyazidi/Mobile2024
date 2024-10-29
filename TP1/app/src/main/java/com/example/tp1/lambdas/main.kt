package com.example.tp1.lambdas

/*fun main()
{
    val count =  "Mississippi".count()
    println(count)
}*/
/*
fun main()
{
    val count1 =  "Mississippi".count(
        {
            p->p in 'A'..'Z'
        }
    )
    val count2 =  "Mississippi".count(
        {
                p->p=='s'
        }
    )
    println(count1)
}
//Fonction anonyme avec inference de type
var variableFunction1 =  {
    var currentYear = 2020
    val name= "Alami"
    "Bienvenu Monsieur $name (CopyRight $currentYear)"
}

//Fonction anonyme avec type explicite
var variableFunction2 : ()-> String =  {
    var currentYear = 2020
    val name= "Alami"
    "Bienvenu Monsieur $name (CopyRight $currentYear)"
}

//Fonction anonyme avec paramètre
var variableFunction3 : (String,Int)-> String =  {
    name, year ->
    "Bienvenu Monsieur $name (CopyRight $year)"
}

//Fonction anonyme avec paramètre
var variableFunction4 : (String)-> String =  {
    var currentYear = 2020
    "Bienvenu Monsieur $it (CopyRight $currentYear)"
}

fun main()
{
    //Appel de l  a fonction
    println(
        variableFunction1()
    )

    println(
        variableFunction2()
    )
    println(
        variableFunction3("MAZZOUZ",2020)
    )
    println(
        variableFunction4("KADIRI")
    )
}*/