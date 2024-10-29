package com.example.tp1.univ

import com.example.tp1.univ.Result
import java.io.FileReader
import java.io.FileWriter

//Realiser une journalisation
//Implementation singleton

//1.Constructeur privée
/*class Journalisation private constructor (val fileName : String)
{
    companion object {
        //propriété privée de type Journalisation
        //2. l'instance unique
        private var instance : Journalisation?=null

        //3.Acceder à l'instance unique
        public fun getInstance(): Journalisation {
            if (instance == null)
                instance = Journalisation("log.txt")

            return instance!!
        }
    }
    fun write(message: String)
    {
        var writer = FileWriter(fileName, true)
        writer.write("$message\n")
        writer.close()
    }
    fun read()
    {
        var reader = FileReader(fileName)
        var content=reader.readText()
        println(content)
        reader.close()
    }
}
*/


 //Avec de la conscision kotlin
object Journalisation
{
    var fileName :String = "log.txt"

    fun write(message: String)
    {
        //println(this)
        var writer = FileWriter(fileName, true)
        writer.write("$message\n")
        writer.close()
    }
    fun read()
    {
        var reader = FileReader(fileName)
        var content=reader.readText()
        println(content)
        reader.close()
    }
}
fun main()
{
    //Operations de journalisation

    val university= University("OFPPT",1890)
    val professor = Professor("LAASRI", 20, 50_000)
    val student1 = Student("Achabi", 19,100)
    val course1 =
        Course("Programmer Kotlin","Cours de programmation avancee Kotlin")

    val course2 =
        Course("Programmer Java","Cours de programmation avancee Java")

    university.hire(professor)
    university.enroll(student1)
    student1.party()
    student1.party()
    student1.party()
    student1.learn()
    student1.takeExam(course1)
    student1.grade(course1,Result.Success(80))
   professor.doOralExam(student1,course1)

}