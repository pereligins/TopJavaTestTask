package com.pereligins.springdemo.controller;

import com.pereligins.springdemo.entity.Book;
import com.pereligins.springdemo.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BooksController {

    @Autowired
    BooksService booksService;

    @GetMapping("/list")
    public String listBooks(Model model) {

        List<Book> books = booksService.getBooks();

        model.addAttribute("books", books);

        return "list-books";

    }

    @GetMapping("/addBook")
    public String showAddBookForm(Model model) {

        Book book = new Book();
        model.addAttribute("book", book);

        return "book-form";
    }

    @PostMapping("/saveBook")
    public String savebook(@ModelAttribute("book") Book book ) {

        booksService.saveBook(book);

        return "redirect:/books/list";
    }

    @GetMapping("/updateBook")
    public String showUpdateBookForm(@RequestParam("bookId") int theId, Model model) {

        Book book = booksService.getBook(theId);

        model.addAttribute("book", book);

        return "book-form";

    }

    @GetMapping("/delete")
    public String deleteBook(@RequestParam("bookId") int theId) {
        booksService.deleteBook(theId);

        return "redirect:/books/list";
    }
}
