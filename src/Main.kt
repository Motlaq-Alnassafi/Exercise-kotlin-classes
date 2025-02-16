class Book(var title: String, var author: String, var yearPublished: Int) {
    fun getBookInfo(): String {
        return "$title by $author ($yearPublished)"
    }
}

fun main() {
    var book = Book("The 48 Laws of Power", "Robert Greene", 1974)
    println(book.getBookInfo())
}