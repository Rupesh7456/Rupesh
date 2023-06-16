package com.takeo.service;

import java.util.List;

import com.takeo.exception.RecordNotFoundException;
import com.takeo.model.Book;

public interface BookService {
public List<Book> getAllBooks();

public Book AddBook (Book book);

public Book saveOrUpdateBook (Book book);

public Book deleteBook (Book book);

Book getBookById(Integer Id) throws RecordNotFoundException;
}
