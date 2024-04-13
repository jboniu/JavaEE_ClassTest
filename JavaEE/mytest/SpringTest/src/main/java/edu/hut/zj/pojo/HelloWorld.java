package edu.hut.zj.pojo;

public class HelloWorld {
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void show(){
        System.out.println(userName+":欢迎来到Spring");
    }
}
