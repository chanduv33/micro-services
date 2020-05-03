package com.capgemini.bookservice.beans;

import lombok.Data;

@Data
public class Book {
	
	private int bookId;
	private String bookName;
	private String author;
}
