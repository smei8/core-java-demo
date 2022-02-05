package dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import pojo.BookPojo;

//these methods work with the data
public class BookDaoImpl implements BookDao {

	//declaring reference variable and will point to ....
	List<BookPojo> allBooks;
	
	//to initialize instance variable
	public BookDaoImpl() {
		allBooks = new ArrayList<BookPojo>();
		
		//BookPojo book1 = new BookPojo(101, "Harry Potter and the chamber of Secrets", 
								//	"J.K.Rowling", "Ficition", 40, "");
		
		allBooks.add(new BookPojo(101, "Harry Potter and the chamber of Secrets", 
									"J.K.Rowling", "Ficition", 40, ""));
		allBooks.add(new BookPojo(102, "Harry Potter and the Goblet of Fire", 
									"J.K.Rowling", "Ficition", 35, ""));
		allBooks.add(new BookPojo(103, "Harry Potter and the Half Blood Prince", 
				"J.K.Rowling", "Ficition", 45, ""));
	}

	@Override
	public List<BookPojo> fetchAllBooks() {
		return allBooks;
	}

	@Override
	public BookPojo addBook(BookPojo bookPojo) {
		//this bookPojo dont have bookID
		//gets the last bookID and add one to it and that will be the new ID
						//allbooks.get(size) gets the last book and it gets that book id and adds one
						//are we setting it here ?
		int newBookID = allBooks.get(allBooks.size()-1).getBookID()+1;
		//adding the bookID
		//we are setting it here
		bookPojo.setBookID(newBookID);
		//after adding the bookID now adding the book in the collection
		allBooks.add(bookPojo);
		//returning the bookPojo with the added bookID
		return bookPojo;
	}

	@Override
	public BookPojo updateBook(BookPojo bookPojo) {
		return null;
	}

	@Override
	public BookPojo deleteBook(int bookID) {
		//need keep track of the item that is remove because need to return that
		BookPojo returnBookPojo = null;
		
		for (int i = 0; i < allBooks.size(); i++) {
			if (allBooks.get(i).getBookID() == bookID) {
				returnBookPojo = allBooks.get(i);
				allBooks.remove(i);
			}
		}
		return returnBookPojo;
	}

	@Override
	public BookPojo fetchABook(int bookID) {
		BookPojo returnBookPojo = null;

		//interrating an ArrayList using for loop
//		for (int i = 0; i < allBooks.size(); i++) {
//			if (allBooks.get(i).getBookID() == bookID) {
//				returnBookPojo = allBooks.get(i);
//				
//			}
//		}
		
		//iterrating an ArrayList using Iterator
		Iterator<BookPojo> itr = allBooks.iterator();
		while (itr.hasNext()) {
			BookPojo book = itr.next();
			if (book.getBookID() == bookID)
				returnBookPojo = book;
		}
		
		//iterating an ArrayList using enhanced for loop
		
		//iterating an ArrayList using foreach - most frequently used one
		
		return returnBookPojo;
	}

}
