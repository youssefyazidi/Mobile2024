package com.example.tp1.univ

class Professor (val name : String, val age : Int, val yearlySalary : Int) {

    val courses = mutableListOf<Course>()

    fun teach(course : Course)
    {
        courses.add(course)
        println("Teaching ${course.title}....")
    }

    fun doOralExam(student:Student, course: Course)
    {
        println("Oral Testing student ${student.name} in ${course.title}")
        student.grade(course, Result.Success(70))
    }

}
