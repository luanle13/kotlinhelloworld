package vn.rowan.kotlinhelloworld

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

//region Quiz 4: Coding Exercise - Understanding Booleans in Kotlin
//fun main() {
//    // Step 1: Declare Boolean variables
//    val myTrue: Boolean = true
//    val myFalse: Boolean = false
//    // Step 2: Logical OR Operation
//    println(myTrue || myFalse) // This will be true
//    // Step 3: Logical AND Operation
//    println(myTrue && myFalse) // This will be false
//    // Step 4: Logical NOT Operation
//    println(!myTrue) // This will be false
//}
//endregion

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

//region Quiz 5: Coding Exercise - Exploring "if-else if-else" in Kotlin
//fun main() {
//    print("Enter your age as a whole number: ")
//    val age = readln().toInt()
//    if (age in 18..39) {
//        println("You can enter the club.")
//    } else if (age > 40) {
//        println("You cannot go into the club, please go home")
//    } else {
//        println("Age not verified. Please contact support.")
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

//region Quiz 6: Coding Exercise - String to Integer Conversion and Basic Input Handling in Kotlin
//fun main() {
//    println("Please enter a number:")
//    val inputString = readln()
//    val inputNumber = inputString.toInt()
//    val multiplier = 5
//    println("Result of operation is: ${inputNumber * multiplier}")
//}
//endregion

//region Day 3: Amy and her Coffee Function
//fun main() {
//    makeCoffee()
//    makeCoffee()
//    makeCoffee()
//}
//
//fun makeCoffee() {
//    println("Buy beans")
//    println("Grind beans")
//    println("Heat water to 90C")
//    println("Add water")
//}
//endregion

//region Day 3: Adding Sugar - Functions with Parameters
//fun main() {
//    makeCoffee(1)
//    makeCoffee(3)
//    makeCoffee(30)
//}
//
//fun makeCoffee(sugarCount: Int) {
//    println("Buy beans")
//    println("Grind beans")
//    println("Heat water to 90C")
//    println("Add water")
//    println("Push hot water through the grinded beans")
//    if (sugarCount == 1) {
//        println("Coffee with 1 spoon of sugar")
//    } else if (sugarCount > 1) {
//        println("Coffee with $sugarCount spoons of sugar")
//    } else {
//        println("Coffee with no sugar")
//    }
//}
//endregion

//region Quiz 8: Sugar Spoon Grammar
//fun main() {
//    makeCoffee(1)
//    makeCoffee(3)
//    makeCoffee(30)
//    makeCoffee(-1)
//    makeCoffee(0)
//}
//
//fun makeCoffee(sugarCount: Int) {
//    println("Buy beans")
//    println("Grind beans")
//    println("Heat water to 90C")
//    println("Add water")
//    println("Push hot water through the grinded beans")
//
//    if (sugarCount == 1) {
//        println("Coffee with 1 spoon of sugar")
//    } else if (sugarCount > 1) {
//        println("Coffee with $sugarCount spoons of sugar")
//    } else {
//        println("Coffee with no sugar")
//    }
//}
//endregion

//region Quiz 9: Coding Exercise - Enhancing the Coffee Machine in Kotlin
// Define function
fun main() {
    println("Who is this coffee for?")
    val name = readln()
    println("How many spoons of sugar do you want?")
    val sugarCount = readln().toInt()
    makeCoffee(sugarCount, name)
}

fun makeCoffee(sugarCount: Int, name: String) {
    println("Buy beans")
    println("Grind beans")
    println("Heat water to 90C")
    println("Add water")
    println("Push hot water through the grinded beans")

    if (sugarCount == 1) {
        println("Coffee with 1 spoon of sugar for $name")
    } else if (sugarCount > 1) {
        println("Coffee with $sugarCount spoons of sugar for $name")
    } else {
        println("Coffee with no sugar for $name")
    }
}
//endregion