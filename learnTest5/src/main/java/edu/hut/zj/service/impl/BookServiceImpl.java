package edu.hut.zj.service.impl;

import edu.hut.zj.dao.BookDao;
import edu.hut.zj.dao.impl.BookDaoImpl;
import edu.hut.zj.service.BookService;

public class BookServiceImpl implements BookService {
    public BookDao bookDao;
    public void setBookDao(BookDaoImpl bookDao) {
        this.bookDao = bookDao;
    }
    @Override
    public void isBook(String autName) {
        bookDao.isBook(autName);
    }


}
