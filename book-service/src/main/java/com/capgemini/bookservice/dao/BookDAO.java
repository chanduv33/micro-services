package com.capgemini.bookservice.dao;

import java.util.List;

import com.capgemini.bookservice.beans.Book;

public interface BookDAO {
	public Book getBook(int id);
	public List<Book> getAllBooks();
}
