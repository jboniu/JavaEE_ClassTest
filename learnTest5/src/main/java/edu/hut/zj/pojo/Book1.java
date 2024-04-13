package edu.hut.zj.pojo;

public class Book1 {
    private int id;
    private String name;
    private String author;
    public Book1(int id, String name, String author){
        this.id=id;
        this.name=name;
        this.author=author;
        System.out.println("IoC容器注入Book1实例");
    }

    @Override
    public String toString() {
        return "Book1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
