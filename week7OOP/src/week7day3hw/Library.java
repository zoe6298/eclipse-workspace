package week7day3hw;

import java.util.ArrayList;

public class Library {
	public String address;
	public ArrayList<Book> bookCollection = new ArrayList<> ();
	
    // Add the missing implementation to this class
	public Library(String libAddress) {
		this.address = libAddress;
	}
	public void addBook(Book title) {
		bookCollection.add(title);
		
	}
	public static void printOpeningHours() {
		System.out.println("Libraries are open daily from 9am to 5pm.");
	}
	
	public void printAddress() {
		System.out.println(this.address);
	}
	public void borrowBook(String title) {
		boolean found = false;
		for(Book book: bookCollection) {
			if((book.getTitle()).equals(title)) {
				found = true;
				if(book.isBorrowed() == false) {
					book.borrowed();
					System.out.println("You successfully borrowed " +  title);
							
				} else {
					System.out.println("Sorry, this book is already borrowed.");				
				} 
			}
		}
		if (!found) {
			System.out.println("Sorry, this book is not in our catalog. ");
		}
	}
	public void printAvailableBooks() {
		int counter = 0;
		for (Book book: bookCollection) {
			if(book.isBorrowed() == false) {
				System.out.println(book.getTitle());
				counter += 1;
			}
		}
		if (counter == 0) {
			System.out.println("No book in catalog ");
		}
	}
	
	public void returnBook(String title) {
		for (Book book: bookCollection) {
			if (book.getTitle().equals(title)) {
				book.returned();
				System.out.println("You successfully returned " +  title);
			}
		}
		
	}

    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
}
