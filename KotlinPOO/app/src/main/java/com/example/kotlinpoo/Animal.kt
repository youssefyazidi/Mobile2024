package com.example.kotlinpoo

open class Animal (val name: String){
    open var couleur: String = "Noir"
    open fun afficher(){
        println("Mon nom d'animal est $name ")
        println("Mon couleur est $couleur ")
    }
}

class Chien(name: String):Animal(name){
    override var couleur: String = "Bringé"
        get() = field.uppercase()
        set(value) {
            field=value.capitalize()
        }
    override fun afficher() {
        println("Mon nom de chien est $name")
        println("Mon couleur est $couleur ")
    }
}
fun main(){
    val animal=Chien("Chien")
    animal.couleur="Merle" //Erreur du compilateur
    animal.afficher()
}
