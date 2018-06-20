package com.pereligins.springdemo.service;

import com.pereligins.springdemo.dao.BooksDAO;
import com.pereligins.springdemo.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BooksServiceImpl implements BooksService {

    @Autowired
    public BooksDAO booksDAO;

    @Override
    @Transactional
    public List<Book> getBooks() {
        return booksDAO.getBooks();
    }

    @Override
    @Transactional
    public void saveBook(Book book) {
        booksDAO.saveBook(book);
    }

    @Override
    @Transactional
    public Book getBook(int theId) {
        return booksDAO.getBook(theId);
    }

    @Override
    @Transactional
    public void deleteBook(int theId) {
        booksDAO.deleteBook(theId);
    }
}
