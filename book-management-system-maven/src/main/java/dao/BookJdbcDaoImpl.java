package dao;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import pojo.BookPojo;

public class BookJdbcDaoImpl implements BookDao {

	@Override
	public List<BookPojo> fetchAllBooks() { //select query
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookPojo addBook(BookPojo bookPojo) { //insert query
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookPojo updateBook(BookPojo bookPojo) { //update query
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookPojo deleteBook(int bookID) { //delete query
		Connection conn = DBUtil.obtainConnection();
		
		try {
			Statement stmt = conn.createStatement();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public BookPojo fetchABook(int bookID) { //select query with a where clause
		// TODO Auto-generated method stub
		return null;
	}

}
