package vn.rowan.kotlinhelloworld

//region Quiz 11: Coding Exercise - Implementing a Kotlin Class with Constructors and Default values
class Book(
    var title: String = "Unknown",
    var author: String = "Anonymous",
    var yearPublished: Int = 2025
) {

    init {
    }
}
//endregion