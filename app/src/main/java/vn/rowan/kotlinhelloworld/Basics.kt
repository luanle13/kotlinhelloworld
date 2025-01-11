package vn.rowan.kotlinhelloworld

fun main() {
    // region Day 2: Booleans true false negation
//    val myTrue: Boolean = true
//    val myFalse: Boolean = false
//
//    println(myTrue || myFalse)
//    println(myTrue && myFalse)
//    println(!myTrue)
    // endregion
    //region Quiz 4: Coding Exercise - Understanding Booleans in Kotlin
//    // Step 1: Declare Boolean variables
//    val myTrue: Boolean = true
//    val myFalse: Boolean = false
//    // Step 2: Logical OR Operation
//    println(myTrue || myFalse) // This will be true
//    // Step 3: Logical AND Operation
//    println(myTrue && myFalse) // This will be false
//    // Step 4: Logical NOT Operation
//    println(!myTrue) // This will be false
    //endregion
    //region Day 2: Char, Unicode and Backslash escape character
//    var myChar = 'a'
//    println(myChar)
//    myChar = '\u00AE'
//    println(myChar)
//    myChar = '\\'
//    println(myChar)
    //endregion
    //region Day 2: Strings
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
    //endregion
    //region Day 2: If Else Statements
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
    //endregion
    //region Day 2: ReadIn and toInt to convert strings into int variables
    //region Comparison operators
    // greater than >
    // lower than <
    // greater equal >=
    // lower equal <=
    // equal ==
    //endregion
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
    //endregion
    //region Day 2: Else if and the in keyword
    //region Comparison operators
    // greater than >
    // lower than <
    // greater equal >=
    // lower equal <=
    // equal ==
    //endregion
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
    //endregion
    //region Quiz 5: Coding Exercise - Exploring "if-else if-else" in Kotlin
//    print("Enter your age as a whole number: ")
//    val age = readln().toInt()
//    if (age in 18..39) {
//        println("You can enter the club.")
//    } else if (age > 40) {
//        println("You cannot go into the club, please go home")
//    } else {
//        println("Age not verified. Please contact support.")
//    }
    //endregion
    //region Day 2: While loops with counters
    var count = 0
    while (count < 3) {
        // so long this content will be executed
        println("Count is $count")
        count++ // same as count = count + 1
    }
    println("Loop is done!")
    //endregion
}