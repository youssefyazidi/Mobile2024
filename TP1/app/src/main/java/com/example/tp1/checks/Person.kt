package com.example.tp1.checks

data class Person( var name: String?=null,
    var age : Int?=null,
    var childrens: MutableList<Person> = ArrayList()
)
{
    fun print()
    {
        println(this)
    }

    fun child(init : Person.()-> Unit )
    {
        val p = Person()
        init.invoke(p)
        childrens.add(p)
    }
}

val init : Person.()-> Unit ={
    name ="AZIZ"
    age= 50
}

fun buildPerson(init : Person.()-> Unit) :Person
{
    val p=Person()
    init.invoke(p)
    return p
}
fun main()
{
   /* val p=buildPerson({
        name ="AZIZ"
        age= 50
        childrens.add(Person("Gaga",3))
        childrens.add(Person("Gugo",2))
    })
    p.print()*/

    val p1= Person().apply {
        name ="AZIZ"
        age= 50
        child{
            name ="Gaga"
            age=3
        }
        child{
            name= "Gugo"
            age =2
        }
    }
    val p2= Person().apply {
        name ="HAMID"
        age = 45

        child {
            name = "SARA"
            age = 4
        }
        child {
            name = "HAMZA"
            age = 5
        }
        child {
            name = "AYMAN"
            age= 10
        }
    }
    p1.print()
    p2.print()
}