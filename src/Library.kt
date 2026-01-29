class Library<T> {
    val items = mutableListOf<T>()
}

data class Book (
    val title: String,
    val author: String,
    val year: Int,
    val isbn: String
)

data class Magazine (
    val title: String,
    val issue: Int,
    val month: String
)

data class DVD (
    val title: String,
    val director: String,
    val duration: Int
)

sealed class LibraryItem {
    class BookItem(val book: Book) : LibraryItem()
    class MagazineItem(val magazine: Magazine) : LibraryItem()
    class DVDItem(val dvd: DVD) : LibraryItem()
}

fun filterByYear(thing: List<Book>, year: Int) : List<Book> {
    return thing.filter { it.year == year }
}

fun sortByTitle(thing: List<LibraryItem>) : List<LibraryItem>{
    return thing.sortedBy { item ->
        when(item){
            is LibraryItem.DVDItem -> item.dvd.title
            is LibraryItem.BookItem -> item.book.title
            is LibraryItem.MagazineItem -> item.magazine.title
        }
    }
}

fun groupByAuthor(book: List<Book>) : Map<String, List<Book>> {
    return book.groupBy { it.author }
}

fun calculateTotalDuration(dvd: List<DVD>) : Int {
    var total = 0
    dvd.forEach { total += it.duration }
    return total
}
