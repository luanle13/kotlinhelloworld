package vn.rowan.kotlinhelloworld.day2

// region Day 2: Booleans true false negation
//fun main() {
//    val myTrue: Boolean = true
//    val myFalse: Boolean = false
//
//    println(myTrue || myFalse)
//    println(myTrue && myFalse)
//    println(!myTrue)
//}
// endregion

//region Day 2: Char, Unicode and Backslash escape character
//fun main() {
//    var myChar = 'a'
//    println(myChar)
//    myChar = '\u00AE'
//    println(myChar)
//    myChar = '\\'
//    println(myChar)
//}
//endregion

//region Day 2: Strings
//fun main() {
//    var name = "Luan"
//    println(name)
//    name = "Rowan"
//    println(name)
//    name = "Very long paragraphs can be stored inside of string"
//    println(name)
//    println(name.lowercase())
//    println(name.uppercase())
//    println(name + " Luan")
//    val firstName = "Luan"
//    val lastName = "Le"
//    println(firstName + " " + lastName)
//    println(firstName + "\n " + lastName)
//    println(firstName + "\t " + lastName)
//}
//endregion

//region Day 2: If Else Statements
//fun main() {
//    var age : Byte = 24
//    //region Comparison operators
//    // greater than >
//    // lower than <
//    // greater equal >=
//    // lower equal <=
//    // equal ==
//    //endregion
//    if(age >= 18) {
//        println("You can go into the club.")
//    } else {
//        println("You are too young to go into the club.")
//    }
//}
//endregion

//region Day 2: ReadIn and toInt to convert strings into int variables
//fun main() {
//// greater than >
//// lower than <
//// greater equal >=
//// lower equal <=
//// equal ==
//    println("Please enter your age as a whole number")
//    // read what the user has entered into the console
//    val enteredValue = readln()
//    // convert the string variable into an int variable
//    val age = enteredValue.toByte()
//    if(age >= 18) {
//        println("You can go into the club.")
//    } else {
//        println("You are too young to go into the club.")
//    }
//}
//endregion

//region Day 2: Else if and the in keyword
//fun main() {
////     greater than >
////     lower than <
////     greater equal >=
////     lower equal <=
////     equal ==
//    println("Please enter your age as a whole number")
//    // read what the user has entered into the console
//    val enteredValue = readln()
//    // convert the string variable into an int variable
//    val age = enteredValue.toByte()
//    if(age in 18..39) {
//        println("You can go into the club.")
//    } else if(age >= 40) {
//        println("You can not go into the club, please go home.")
//    } else {
//        println("You are too young to go into the club.")
//    }
//}
//endregion

//region Day 2: While loops with counters
//fun main() {
//    var count = 0
//    while (count < 3) {
//        // so long this content will be executed
//        println("Count is $count")
//        count++ // same as count = count + 1
//    }
//    println("Loop is done!")
//}
//endregion

//region Day 2: While loops with user input
//fun main() {
//    var userInput = readln()
//    while (userInput == "1") {
//        println("While loop executed")
//        userInput = readln()
//    }
//    println("Loop is done!")
//}
//endregion