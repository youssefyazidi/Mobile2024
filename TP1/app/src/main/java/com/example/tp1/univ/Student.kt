package com.example.tp1.univ

import java.lang.Math.max
import java.lang.Math.min
import java.util.Date

class Student(val name:String, val age: Int, val matriculationNo:Int) {

    //Collection de graes
    val grades = mutableMapOf<Course,Result>()
    //Les inscriptions
    val enrollements = mutableListOf<Course>()
    private var successLikelihoodPercent : Int = 50

    fun enroll(course : Course)
    {
        //Code
        enrollements.add(course)
        println("$name enrolled in ${course.title}")
       // var journalisation = Journalisation("log.txt")
        //journalisation.write("$name enrolled in ${course.title} at ${Date()}")

       /* var journalisation =Journalisation.getInstance()*/
        /*journalisation.write("$name enrolled in ${course.title} at ${Date()}")*/

            //Appel de Object Journalisation
        Journalisation.write("$name enrolled in ${course.title} at ${Date()}")
    }

    fun takeExam(course : Course)
    {
        if(enrollements.contains(course))
        {
            grades.put(course,Result.NoResultYet)
        }
        println("$name takes exam in ${course.title}")
       // var journalisation = Journalisation("log.txt")
       // journalisation.write("$name takes exam in ${course.title} at ${Date()}")

        //Recuperer l'instance unique
      /*  var journalisation =Journalisation.getInstance()*/

        //Appel de Object Journalisation
        Journalisation.write("$name enrolled in ${course.title} at ${Date()}")
    }

    fun learn()
    {
        println("$name is learning....")
        successLikelihoodPercent =min(successLikelihoodPercent+2,100)
    }

    fun party()
    {
        println("$name is partying \uD83C \uDF89")
        successLikelihoodPercent =max(successLikelihoodPercent-2,0)
    }

    fun grade(course : Course, grade : Result)
    {
            println("${course.title} grade is ${grade} for $name")
            if(grades.contains(course))
            {
                grades[course]=grade
            }
    }

}


