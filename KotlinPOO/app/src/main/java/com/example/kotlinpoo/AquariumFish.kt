package com.example.kotlinpoo

//La classe AquariumFish est abstraite => pas d'instance
abstract class AquariumFish {
    var num = 1
    abstract var Color : String
    abstract fun printAquarium()

}
//Interface Fish Action
interface  FishAction{
    var name : String
    val propertyWithImplementation: String
        get() = "foo"

    fun eat()

    fun swim(){
        println("kay3om")
    }
}

//Classe
class Shark : AquariumFish(),FishAction {
    override var Color : String = "gray"

    override var propertyWithImplementation: String = ""
        get()="test"
        set(value) {
            field = value
        }

    override fun printAquarium() {
      println("Aquaruim shark de couleur $Color")
    }

    override var name: String ="shark name"

    override fun eat() {
        println("hunt and eat fish")
    }

}
class Plecostomus : AquariumFish(), FishAction{
    override var Color : String = "gold"
    override var name: String ="Plecostomus name"
    override fun printAquarium() {
        println("Aquaruim shark de couleur $Color")
    }

    override fun eat() {
        println("eat algae")
    }
}
fun main()
{
    var sharkAquarium = Shark()
    var plecostomusAquarium = Plecostomus()
    sharkAquarium.printAquarium()
    plecostomusAquarium.printAquarium()

    sharkAquarium.eat()
    plecostomusAquarium.eat()

    println(sharkAquarium.propertyWithImplementation)
}