import scala.io.StdIn.readLine

object practical05Q2{

    //Funtions of question 02 starts here --------------------------------------------------------------------------------
    case class Book(title: String, author: String, ISBN: String)

    var library: Set[Book] = Set(Book("Harry Potter", "J.K. Rowling", "001"),Book("Little Women", "Louisa May Alcott", "002"),Book("The Kite Runner", "Khaled Hossein", "003"))

    def addNewBook(): Unit = {

        printf("\n\n");
        println("Enter book title:")
        val title = scala.io.StdIn.readLine()
        
        println("Enter book author:")
        val author = scala.io.StdIn.readLine()
    
        println("Enter book ISBN:")
        val num = scala.io.StdIn.readLine()

        val newBook = Book(title, author, num)
        
        if (library.exists(_.ISBN == num)) {
            printf("\n\n");
            println("This Book already exists in the library.")
        }
        else{
            printf("\n\n");
            library += newBook
            println("Book added successfully.")
        }
    }

    def removeBookByISBN(): Unit = {
        printf("\n\n");
        println("Enter ISBN of the book you need to remove:")
        val num = scala.io.StdIn.readLine()

        if (library.exists(_.ISBN == num)) {
            printf("\n\n");
            library = library.filterNot(_.ISBN == num)
            println("Book removed successfully.")
        }
        else{
            printf("\n\n");
            println("This book doesn't exist in the library")
        }
    }

    def checkBookByISBN(): Unit = {
        printf("\n\n");
        println("Enter ISBN of the book you need to check:")
        val num = scala.io.StdIn.readLine()

        if (library.exists(_.ISBN == num)){
            printf("\n\n");
            println("Book is available.")
        }
        else{
            printf("\n\n");
            println("Book does not exist in the library.")
        }
    }

    def searchBookByTitle(): Unit = {
        
        printf("\n\n");
        println("Enter book title to search:")
        val title = scala.io.StdIn.readLine()

        if (library.exists(_.title == title)){
            printf("\n\n");
            println("Book is available.")
        }
        else{
            printf("\n\n");
            println("Book does not exist in the library.")
        }
    }

    def displayBooksByAuthor(): Unit = {
        
        printf("\n\n");
        println("Enter author to display their books:")
        val author = scala.io.StdIn.readLine()

        val booksByAuthor = library.filter(_.author.equalsIgnoreCase(author))

        if (booksByAuthor.nonEmpty) {
            printf("\n\n");
            println(s"Books by ${author}")
            booksByAuthor.foreach(book => println(s"Title: ${book.title}, ISBN: ${book.ISBN}"))
        }
        else{
            printf("\n\n");
            printf("No books found by %s in the library\n",author)
        }
    }

    def displayLibraryCollection(): Unit = {
        printf("\n\n");
        println("Current library collection:")
        library.foreach(book => println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.ISBN}"))
    }

    def main(args : Array[String]): Unit = {
        
        printf("\n\n");
        println("Question 02:")
        var continue = true

        while (continue) {
            printf("\n\n")
            println("Menu of the library management system:")
            println("1.Add new book")
            println("2.Remove a book by ISBN")
            println("3.Check if a book is in the library by ISBN")
            println("4.Display the current library collection")
            println("5.Search for a book by it's title")
            println("6.Display all books by a specific author")
            println("7.Exit")

            printf("Enter your choice: ")
            val choice = scala.io.StdIn.readInt()

            choice match {
                case 1 => addNewBook()
                case 2 => removeBookByISBN()
                case 3 => checkBookByISBN()
                case 4 => displayLibraryCollection()
                case 5 => searchBookByTitle()
                case 6 => displayBooksByAuthor()
                case 7 => continue = false
                case _ => println("Invalid choice")
            }
        }
    }

}
