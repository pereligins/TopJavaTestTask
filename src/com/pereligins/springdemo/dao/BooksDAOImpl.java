package com.pereligins.springdemo.dao;

import com.pereligins.springdemo.entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BooksDAOImpl implements BooksDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Book> getBooks() {

        Session currentSession = sessionFactory.getCurrentSession();

        Query<Book> query = currentSession.createQuery("from Book", Book.class);

        List<Book> books = query.getResultList();

        return books;
    }

    @Override
    public void saveBook(Book book) {

        Session session = sessionFactory.getCurrentSession();

        session.saveOrUpdate(book);

    }

    @Override
    public Book getBook(int theId) {

        Session session = sessionFactory.getCurrentSession();

        Book book = session.get(Book.class, theId);

        return book;
    }

    @Override
    public void deleteBook(int theId) {

        Session session = sessionFactory.getCurrentSession();

        Query query = session.createQuery("delete from Book where id = :idParam");

        query.setParameter("idParam", theId);


        query.executeUpdate();
    }

    @Override
    public void setRead(int theId, boolean read) {
        Session session = sessionFactory.getCurrentSession();

        Query query = session.createQuery("update Book set readAlready = :read where id = :idParam");

        query.setParameter("idParam", theId);
        query.setParameter("read", read);

        query.executeUpdate();
    }
}
