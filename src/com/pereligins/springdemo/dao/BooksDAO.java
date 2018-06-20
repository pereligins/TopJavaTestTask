package com.pereligins.springdemo.dao;

import com.pereligins.springdemo.entity.Book;

import java.util.List;

public interface BooksDAO {

    public List<Book> getBooks();
    public void saveBook(Book customer);

    Book getBook(int theId);

    void deleteBook(int theId);

    void setRead(int theId, boolean read);
}
