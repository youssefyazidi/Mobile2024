package com.example.tp1.exceptions

fun main()
{
    var swordsJuggling: Int?=null
    val isJugglingProficient = (1..3).shuffled().last() == 3

    if(isJugglingProficient)
    {
        swordsJuggling = 2
    }
    //gérer l'exception
    try {
        proficiencyCheck(swordsJuggling)
        //Le code leve une exception = ArithmeticException
        println(5/0)
        juggleSwords(swordsJuggling!!)
        //Le code peut lever une exception = Creation d'un objet
        //d'une classe de type Exception -> NullPointerException
        swordsJuggling = swordsJuggling!!.plus(1)
        println("Vous Jonglez avec $swordsJuggling épees !")


    }
    catch(e : Exception)
    {
        println(e.message)
    }
    /*catch(e : UnskilledSwordJungglingException)
    {
      println(e.message)
    }
    catch(e : ArithmeticException)
    {
        println(e.message)
    }
    catch(e : IllegalArgumentException)
    {
        println(e.message)
    }*/


}
/*
fun proficiencyCheck(swordsJuggling : Int?)
{
    if (swordsJuggling==null)
        //Je leve une exception
        throw IllegalStateException("Le joueur ne sait pas jouer avec des epees")
}*/
fun proficiencyCheck(swordsJuggling : Int?)
{
    if (swordsJuggling==null)
    //Je leve une exception
        throw UnskilledSwordJungglingException()
}
/*fun proficiencyCheck(swordsJuggling : Int?)
{
    checkNotNull(swordsJuggling,{"Le joueur ne sait pas jouer avec des epees"})
}*/

fun juggleSwords(swordsJuggling : Int)
{
    require(swordsJuggling >=3, {"" +
            "Jongler avec au moins de 3 eppes pour que ca soit amusant!!!"})
}