package vn.rowan.kotlinhelloworld.day3

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

//region Day 3: Functions that return something
//fun main() {
//    var myResult = add(5, 10)
//    println(myResult)
//}
//
//fun add(num1: Int, num2: Int): Int {
//    val result = num1 + num2
//    return result
//}
//
//fun askCoffeeDetails(sugarCount: Int, name: String) {
//    println("Buy beans")
//    println("Grind beans")
//    println("Heat water to 90C")
//    println("Add water")
//    println("Push hot water through the grinded beans")
//
//    if (sugarCount == 1) {
//        println("Coffee with 1 spoon of sugar for $name")
//    } else if (sugarCount > 1) {
//        println("Coffee with $sugarCount spoons of sugar for $name")
//    } else {
//        println("Coffee with no sugar for $name")
//    }
//}
//endregion

//region Day 3: More about return types
//fun main() {
//    println("Please enter the first number: ")
//    val firstNumber: Double = readln().toDouble()
//    println("Please enter the second number: ")
//    val secondNumber: Double = readln().toDouble()
//    val addResult = add(firstNumber, secondNumber)
//    println("The result of $firstNumber + $secondNumber is: $addResult")
//    val divideResult = divide(firstNumber, secondNumber)
//    println("The result of $firstNumber / $secondNumber is: $divideResult")
//
//}
//
//fun divide(num1: Double, num2: Double): Double {
//    val result = num1 / num2
//    return result.toDouble()
//}
//
//fun add(firstNumber: Double, secondNumber: Double): Double {
//    return firstNumber + secondNumber
//}
//endregion

//region Day 3: Limitation of Output - Return Types
//fun main() {
//
//}
//
//fun askCoffeeDetails() {
//    println("Who is this coffee for?")
//    val name = readln()
//    println("How many spoons of sugar do you want?")
//    val sugarCount = readln().toInt()
//    makeCoffee(sugarCount, name)
//}
//
//fun makeCoffee(sugarCount: Int, name: String) {
//    println("Buy beans")
//    println("Grind beans")
//    println("Heat water to 90C")
//    println("Add water")
//    println("Push hot water through the grinded beans")
//
//    if (sugarCount == 1) {
//        println("Coffee with 1 spoon of sugar for $name")
//    } else if (sugarCount > 1) {
//        println("Coffee with $sugarCount spoons of sugar for $name")
//    } else {
//        println("Coffee with no sugar for $name")
//    }
//}
//endregion

//region Day 3: Creating our first Class and Object
//fun main() {
//    var daisy = Dog()
//}
//endregion

//region Day 3: Understanding Constructors and Default values
//fun main() {
//    var daisy = Dog("Daisy", "Dwarf poodle", 1)
//    println("${daisy.name} is a ${daisy.breed} and is ${daisy.age} years old")
//}
//endregion