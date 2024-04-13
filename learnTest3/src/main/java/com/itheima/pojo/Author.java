package com.itheima.pojo;

import java.util.List;

public class Author {
    private int autId;
    private String autName;
    private String autCountry;
    private List<Book> bookList;

    @Override
    public String toString() {
        return "Author{" +
                "autId=" + autId +
                ", autName='" + autName + '\'' +
                ", autCountry='" + autCountry + '\'' +
                ", bookList=" + bookList +
                '}';
    }

    public int getAutId() {
        return autId;
    }

    public void setAutId(int autId) {
        this.autId = autId;
    }

    public String getAutName() {
        return autName;
    }

    public void setAutName(String autName) {
        this.autName = autName;
    }

    public String getAutCountry() {
        return autCountry;
    }

    public void setAutCountry(String autCountry) {
        this.autCountry = autCountry;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}
