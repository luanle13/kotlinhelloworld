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
    shoppingList.removeAt(2)
    println(shoppingList)
    shoppingList.removeAt(1)
    println(shoppingList)
    shoppingList.add(2, "RAM")
    println(shoppingList)
    println(shoppingList[3])

    shoppingList[3] = "Graphics Card RX 7800XT"
    println(shoppingList)

    //[0][1][2][3][4]
}