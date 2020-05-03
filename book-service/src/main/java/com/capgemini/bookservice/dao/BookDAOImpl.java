package com.capgemini.bookservice.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.capgemini.bookservice.beans.Book;

@Repository
public class BookDAOImpl implements BookDAO{

	
	private static List<Book> booksDB = new ArrayList<Book>();
	static {
		Book b1 = new Book();
		b1.setAuthor("Razat");
		b1.setBookName("Aie Dil hai muskhil");
		b1.setBookId(1);
		booksDB.add(b1);
		Book b2 = new Book();
		b2.setAuthor("Chandu");
		b2.setBookName("Temper");
		b2.setBookId(2);
		booksDB.add(b2);
	}
	
	@Override
	public Book getBook(int id) {
		for (Book book : booksDB) {
			if(book.getBookId()==id) {
				return book;
			}
		}
		return null;
	}

	@Override
	public List<Book> getAllBooks() {
		return booksDB;
	}

}
