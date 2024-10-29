package com.example.app12024.activite3

fun main() {
    val firstUserEmailId = "user_one@gmail.com"
         // The following line of code assumes that you named your parameter as emailId.
        // If you named it differently, feel free to update the name.
    println(displayAlertMessage(emailId = firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"
    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))

    println()
    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"
    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()
}

fun displayAlertMessage(operatingSystem: String = "Unkown OS", emailId: String): String {

    return "There's a new sign-in request on $operatingSystem " +
            "for your Google Account $emailId."
}
// Define your displayAlertMessage() below this line.