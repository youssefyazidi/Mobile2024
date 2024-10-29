package com.example.tp1.checks

fun main()
{

    var obj :Any?=null
    //
    // obj = "Mohamed"
    obj = 5

    //println (obj.length)
    if (obj is String) {
        print(obj.length)
    }

    if (obj !is String) { // same as !(obj is String)
        print("Not a String")
    }
    else {
        print(obj.length)
    }

}

fun demo1(x: Any) {
    if (x is String) {
        print(x.length) // x est automatiquement converti en String
    }
}

fun demo2(x: Any) {
    if (x !is String) {
        return
    }
    print(x.length) // x est automatiquement converti en String
}
