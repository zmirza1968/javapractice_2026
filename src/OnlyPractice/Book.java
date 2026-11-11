package OnlyPractice;

public class Book {

	String title;
	String author;
	boolean isAvailable;

	Book() {

		this.title = "unkown";
		this.author = "unkown";
		this.isAvailable = true;
	}

	// Parameterized constructor
	Book(String title, String author, boolean isAvailable) {
		this.title = title;
		this.author = author;
		this.isAvailable = isAvailable;
	}

	// Method to borrow the book
	void borrowBook() {
		if (isAvailable) {
			isAvailable = false;
			System.out.println("Book borrowed :" + title);
		} else {
			System.out.println("Book not available :" + title);
		}

	}

	// Method to return the book
	void returnBook() {
		if (!isAvailable) {
			isAvailable = true;
			System.out.println("Book returned: " + title);
		} else {
			System.out.println("Book was not borrowed: " + title);
		}
	}

	// Method to print book details
	void printBookDetails() {
		System.out.println("Title: " + title + ", Author: " + author + ", Available: " + isAvailable);

	}

	public static void main(String arg[]) {
		Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", true);
		Book book2 = new Book();

		book1.printBookDetails();
		book1.borrowBook();
		book1.printBookDetails();
		book1.returnBook();
		book1.printBookDetails();

		book2.title = "1984";
		book2.author = "George Orwell";
		book2.printBookDetails();

	}
}
