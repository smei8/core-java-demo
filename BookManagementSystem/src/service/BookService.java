package service;

import java.util.List;

import pojo.BookPojo;
//question, if this interface is the same as the bookdao why do we need another
public interface BookService {

	//performs the CRUD operation
	
	//Read - fetch all book
	List<BookPojo> fetchAllBooks();
	//Create
	BookPojo addBook(BookPojo bookPojo);
	//Update
	BookPojo updateBook(BookPojo bookPojo);
	//Delete
	BookPojo deleteBook(int bookID);
	//Fetch one book
	BookPojo fetchABook(int bookID);
	
}
