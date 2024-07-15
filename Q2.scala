import scala.collection.mutable.Set
import scala.io.StdIn.readLine
import scala.io.StdIn.readInt

object library_management{
    def main(args: Array[String]): Unit = {

        //define a case class for Book
        case class Book(title: String,author:String,isbn:String)

        //intially declareds three books
        val book1 = Book("Learning Functional Programming in Scala","Alvin Alexander","12415124")
        val book2 = Book("The Colombo Town","Kumara","3421351")
        val book3 = Book("The student","Nimal","77771111")

        val books: Set[Book] = Set(book1,book2,book3)
        

        // adding new book to system
        def getBook():Any={
            var book_name = readLine("Enter the name of the book: ")
            var book_author = readLine("Enter the author: ")
            var book_isbn = readLine(("Enter the isbn of the book: "))
                if 
            val book4=Book(book_name,book_author,book_isbn)
            books += book4
        }

        def printBooks(n:Set[Book]): Any = if(!n.isEmpty)
            {println(s"Title: ${n.head.title}, Author: ${n.head.author}, ISBN: ${n.head.isbn}");printBooks(n.tail)}

        printBooks(books)
        getBook()
        printBooks(books)
    }
}