package vn.rowan.kotlinhelloworld.quiz11

//region Quiz 11: Coding Exercise - Implementing a Kotlin Class with Constructors and Default values
fun main() {
    val myBook = Book()
    println(myBook.title)
    println(myBook.author)
    println(myBook.yearPublished)

    val customBook = Book("The Alchemist", "Paulo Coelho", 1988)
    println(customBook.title)
    println(customBook.author)
    println(customBook.yearPublished)
}
//endregion