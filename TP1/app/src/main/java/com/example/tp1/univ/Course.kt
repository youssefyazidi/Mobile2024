package com.example.tp1.univ

//Un dataclass = Une classe entite
// <=> (On s'instresse pas aux methodes, juste les données)
data class Course(val title :String, val description : String)
{
    //la variable nombre est une donnée static
    companion object {
     private    var nombre=0

        fun getNombre():Int{
            return nombre
        }
    }

    init
    {
        nombre++
    }


}
/*
fun main()
{
    //data classe = classe + toString + equals
    val course1 = Course("Programmer Kotlin","Cours de programmation avancee Kotlin")
    val course2 = Course("Programmer Java","Cours de programmation avancee Java")

    val student1 = Student("Achabi", 19,100)
    val student2 = Student("Achabi", 19,100)
    val student3 = student1
    println(course1.equals(course2))

    println(student1.equals(student2))
    println(student1.equals(student3))

    println(Course.getNombre())

}*/