package dao;

import java.util.List;
import pojo.BookPojo;

public interface BookDao {
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
