package edu.hut.zj.controller.impl;

import edu.hut.zj.controller.BookController;
import edu.hut.zj.service.BookService;

public class BookControllerImpl implements BookController {
    public BookService bookService;

    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    @Override
    public void isBook(String autName) {
        bookService.isBook(autName);
    }
}
