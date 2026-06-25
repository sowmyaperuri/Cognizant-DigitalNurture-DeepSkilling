public class LibraryTest {
    public static void main(String[] args) {
        Book[] books = {
            new Book(1, "Java Basics", "James Gosling"),
            new Book(2, "Data Structures", "Mark Allen"),
            new Book(3, "Operating Systems", "Galvin"),
            new Book(4, "Computer Networks", "Andrew Tanenbaum"),
            new Book(5, "DBMS", "Korth")
        };

        // Linear Search
        System.out.println("Linear Search Result:");
        Book result1 = LibrarySearch.linearSearch(books, "DBMS");
        if (result1 != null) {
            System.out.println(result1);
        } else {
            System.out.println("Book not found.");
        }

        // Sort before Binary Search
        LibrarySearch.sortBooksByTitle(books);

        // Binary Search
        System.out.println("\nBinary Search Result:");
        Book result2 = LibrarySearch.binarySearch(books, "DBMS");
        if (result2 != null) {
            System.out.println(result2);
        } else {
            System.out.println("Book not found.");
        }
    }
}