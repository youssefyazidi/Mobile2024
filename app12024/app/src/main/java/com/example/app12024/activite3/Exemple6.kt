package com.example.app12024.activite3

fun main() {
    //Inference de type => String
    val nextMeeting = "Next meeting is: "
    val date = "January 1"
    var count = 0
    // + operateur de concatenation => operandes de type String
    val reminder = nextMeeting + date + " at work"
    count--
    println(reminder)
    println(count)
}