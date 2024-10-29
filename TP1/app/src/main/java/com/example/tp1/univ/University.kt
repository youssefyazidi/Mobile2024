package com.example.tp1.univ

import java.util.Date

class University(val name : String, val foundingYear : Int) {

    //mutablelist des professeurs
    val professors = mutableListOf<Professor>()
    //mutablelist des etudiants
    val students = mutableListOf<Student>()

    fun hire(prof : Professor)
    {
        //hire a new Professor
        professors.add(prof)
        println ("Hired Professor ${prof.name}")
       // var journalisation = Journalisation("log.txt")
       // journalisation.write("Hired Professor ${prof.name}at ${Date()}")

       /* var journalisation =Journalisation.getInstance()
        journalisation.write("Hired Professor ${prof.name}at ${Date()}")*/

        Journalisation.write("Hired Professor ${prof.name}at ${Date()}")
    }
    fun enroll(student : Student)
    {
        //enroll a new Student
        students.add(student)
        println ("Enrolled student  ${student.name} at $name")
        Journalisation.write("Enrolled student  ${student.name} at $name at ${Date()}")
    }

}