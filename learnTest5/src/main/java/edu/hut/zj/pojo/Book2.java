package edu.hut.zj.pojo;

public class Book2 {
    private int id;
    private String name;
    private String author;
//    private Book1 book1;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

//    public void setBook1(Book1 book1) {
//        this.book1 = book1;
//    }
    @Override
    public String toString() {
        return "Book2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
//                ", book1=" + book1 +
                '}';
    }



}
