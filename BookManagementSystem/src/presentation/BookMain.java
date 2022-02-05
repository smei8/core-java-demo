package presentation;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import pojo.BookPojo;
import service.BookService;
import service.BookServiceImpl;

public class BookMain {

	public static void main(String[] args) {
		//this object variable is pointing to bookServiceImpl
		BookService bookService = new BookServiceImpl();
		
		//takes users input
		Scanner scan = new Scanner(System.in);
		// how is the user input being compared to ch? 
		char ch = 'y';
		//while user input == y when ask
		while(ch == 'y') {
		
			System.out.println("**************************************************************");
			System.out.println("\tBook Managament System");
			System.out.println("**************************************************************");
			System.out.println("1. Add a Book");
			System.out.println("2. Update a Book");
			System.out.println("3. Remove a Book");
			System.out.println("4. Fetch all Books");
			System.out.println("5. Fetch a Book");
			System.out.println("6. Exit");
			System.out.println("**************************************************************");
			System.out.println("Please enter menu option: ");
			
			//option gets the menu input
			int option = scan.nextInt();
			//...? this is here because?
			scan.nextLine();
			
			
			switch(option) {
				case 1:
					//object var to store the user input
					BookPojo newBook= new BookPojo();
					
					System.out.println("Enter Book Title: ");
					newBook.setBookTitle(scan.nextLine());
					System.out.println("Enter Book Auther: ");
					newBook.setBookAuther(scan.nextLine());
					System.out.println("Enter Book Genre: ");
					newBook.setBookGenre(scan.nextLine());
					System.out.println("Enter Book Cost: ");
					newBook.setBookCost(scan.nextInt());
					
					//object var addedbook created to store the newly added book
					BookPojo addedBook = bookService.addBook(newBook);
					
					System.out.println("*********************************************************************************************************");
					System.out.println("Book ID" + "\t" + "Book Title" + "\t\t\t\t" + "Book Auther" + "\t" + "Book Genre" + "\t" + "Book Cost");
					System.out.println("*********************************************************************************************************");
					System.out.println("Book was added successfully!\nYou new Book ID is " + addedBook.getBookID());
					
					break;
				case 2:
					System.out.println("Enter the book id that you want to update: ");
					//user input of book id of the book that needs to be updated
					int updatebookId = scan.nextInt();
					//fetches the book of the book id user inputed and stores it in fetchedoldbook
					BookPojo fetchedOldBook = bookService.fetchABook(updatebookId);
					
					//book id from user input does not exist, why is it checking against null?
					if(fetchedOldBook == null) { 
						System.out.println("Please enter a valid book ID!");
						break;
					}
					System.out.println("Book ID: " + fetchedOldBook.getBookID());
					System.out.println("Book Title: " + fetchedOldBook.getBookTitle());
					System.out.println("Book Auther: " + fetchedOldBook.getBookAuther());
					System.out.println("Book Genre: " + fetchedOldBook.getBookGenre());
					System.out.println("Book Cost: " + fetchedOldBook.getBookCost());
					System.out.println("Please enter the new book cost: ");
					
					//sets the new book cost entered by the user
					fetchedOldBook.setBookCost(scan.nextInt());
					//returns the updated book
					bookService.updateBook(fetchedOldBook);
					
					System.out.println("Book updated successfully!");
					break;
				case 3:
					System.out.println("Enter the book id that you want to delete: ");
					//this var scope is available within the switch {} but not outside?
					int bookId = scan.nextInt();
					BookPojo fetchedBook = bookService.fetchABook(bookId);
					
					//why is this compared to again nukk
					if(fetchedBook == null) { //book id from user input does not exist
						System.out.println("Please enter a valid book ID!");
						break;
					}
					System.out.println("Book ID: " + fetchedBook.getBookID());
					System.out.println("Book Title: " + fetchedBook.getBookTitle());
					System.out.println("Book Auther: " + fetchedBook.getBookAuther());
					System.out.println("Book Genre: " + fetchedBook.getBookGenre());
					System.out.println("Are you sure you want to remove this book? (y/n): ");
					
					char deleteOption = scan.next().charAt(0); //what is charAt(0)?
					if (deleteOption == 'y') {
						bookService.deleteBook(bookId);
						System.out.println("Book was successfully removed!!");
					}
					break;
				case 4:
					List<BookPojo> allBooks = bookService.fetchAllBooks();
					Iterator<BookPojo> itr = allBooks.iterator();
					while (itr.hasNext()) {
						BookPojo book = itr.next();
						System.out.println(book.getBookID() + "\t" + book.getBookTitle() + "\t" + 
								book.getBookAuther() + "\t" + book.getBookGenre() + "\t" + book.getBookCost());
					}
					break;
				case 5:
					System.out.println("Enter the book id that you want to fetch: ");
					
					int abookId = scan.nextInt();
					BookPojo fetchedaBook = bookService.fetchABook(abookId);
					
					if(fetchedaBook == null) { //book id from user input does not exist
						System.out.println("Please enter a valid book ID!");
						break;
					}
					System.out.println("Book ID: " + fetchedaBook.getBookID());
					System.out.println("Book Title: " + fetchedaBook.getBookTitle());
					System.out.println("Book Auther: " + fetchedaBook.getBookAuther());
					System.out.println("Book Genre: " + fetchedaBook.getBookGenre());
					
					break;
				case 6:
					System.exit(0);  //to convey to the caller(JVM) to exit the system with no problem 
			}
			System.out.println("Do you want to continue? (y/n): ");
			ch = scan.next().charAt(0);
			//scan.nextLine();
		}
	}

}
