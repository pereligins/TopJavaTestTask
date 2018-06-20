package com.pereligins.springdemo.service;

import com.pereligins.springdemo.entity.Book;

import java.util.List;

public interface BooksService {

    public List<Book> getBooks();

    public void saveBook(Book book);

    public Book getBook(int theId);

    void deleteBook(int theId);
}
