package vn.rowan.kotlinhelloworld.day4

fun main() {
    // Immutable list - you cannot add items after the initialization
    //val shoppingList = listOf("Processor", "RAM", "Graphics Card", "SSD")
    // Mutable list - you can add items later and modify
    val shoppingList = mutableListOf("Processor", "RAM", "Graphics Card RTX 3060", "SSD")
    // adding items to lists
    shoppingList.add("Cooling System")
    shoppingList.remove("Graphics Card RTX 3060")
    shoppingList.add("Graphics Card RTX 4090")

    println(shoppingList)
}