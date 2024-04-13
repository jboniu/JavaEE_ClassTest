package com.itheima.pojo;

public class User {
    private  int userId;
    private  String userName;
    private  int userAge;

    @Override
    public String toString(){
        return "User{"+
                "uid="+userId+
                ",uname="+userName+'\''+
                ".uage="+userAge+
                '}';
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }
}
