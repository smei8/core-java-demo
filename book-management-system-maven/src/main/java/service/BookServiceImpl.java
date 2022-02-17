package service;

import java.util.List;

import dao.BookDao;
import dao.BookDaoImpl;
import pojo.BookPojo;

//presentation layer will be calling the service layer and these methods will then call the DAO layer
public class BookServiceImpl implements BookService {
	
	BookDao bookDao;

	public BookServiceImpl() {
		bookDao = new BookDaoImpl();
	}
	
	@Override
	public List<BookPojo> fetchAllBooks() {
		return bookDao.fetchAllBooks();
	}

	@Override
	public BookPojo addBook(BookPojo bookPojo) {
		return bookDao.addBook(bookPojo);
	}

	@Override
	public BookPojo updateBook(BookPojo bookPojo) {
		return bookDao.updateBook(bookPojo);
	}

	@Override
	public BookPojo deleteBook(int bookID) {
		return bookDao.deleteBook(bookID);
	}
	
	//other than sending a message to the compiler does annotation do anything else
	//would it make a difference if it was not included?
	@Override
	public BookPojo fetchABook(int bookID) {
		return bookDao.fetchABook(bookID);
	}

}
