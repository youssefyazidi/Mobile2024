package com.example.kotlinpoo


  /*  fun buildAquarium()
    {
        //Instanciation- En utilisant le constructeur par defaut
        val myAquarium = Aquarium()
        //Appel de methode printSize
        myAquarium.printSize()

        //Mettre à jour la propriétés (appel de set)
        myAquarium.height = 60
        //appel de get (lecture)
        println(myAquarium.height)
        //Appel de methode printSize
        myAquarium.printSize()
    }*/


fun buildAquarium()
{
    //Instanciation- En utilisant le constructeur primaire
    val myAquarium= Aquarium()
    //Appel de methode printSize
    myAquarium.printSize()

}
fun buildTowerTank()
{
    //Instanciation- En utilisant le constructeur primaire
    val myAquarium= TowerTank(600, 100)
    //Appel de methode printSize
    myAquarium.printSize()
}
fun buildAquariums()
{
    //Instanciation- En utilisant le constructeur primaire
    val myAquarium1= Aquarium(200,40,80)
    //Appel de methode printSize
    myAquarium1.printSize()

    //Instanciation- En utilisant le constructeur primaire
    val myAquarium2= Aquarium()
    //Appel de methode printSize
    myAquarium2.printSize()

    //Instanciation- En utilisant le constructeur primaire
    val myAquarium3= Aquarium(300)
    //Appel de methode printSize
    myAquarium3.printSize()

    val myAquarium4= Aquarium(300, height = 80)
    //Appel de methode printSize
    myAquarium4.printSize()

    //Utiliser le constructeur secondaire
    val myAquarium5= Aquarium(400)

    //Modification de la prpriété width

    myAquarium5.printSize()
    println(myAquarium5.volume)
}

    fun main()
    {
        buildAquarium()
        buildTowerTank()
    }