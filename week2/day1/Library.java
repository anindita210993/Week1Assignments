package week2.day1;

public class Library { //Create a Java class named Library:
	
	public void addBook(String BookTitle) { //Define a method addBook
		System.out.println(BookTitle);

	}
	public void issueBook() { //Define a method issueBook
		System.out.println("Book issued successfully");
		

	}

	public static void main(String[] args) { //main method
		Library book = new Library();  //object creation
		book.addBook("Book added successfully");//Call both methods using the object.
		book.issueBook();

	}

}
