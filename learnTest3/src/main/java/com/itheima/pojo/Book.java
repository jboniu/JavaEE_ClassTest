package com.itheima.pojo;

public class Book {
    private int booId;
    private String booName;
    private  int booAutid;
    @Override
    public String toString() {
        return "Book[" +
                "booId=" + booId +
                ", booName='" + booName + '\'' +
                ']';
    }

    public int getBooId() {
        return booId;
    }

    public void setBooId(int booId) {
        this.booId = booId;
    }

    public String getBooName() {
        return booName;
    }

    public void setBooName(String booName) {
        this.booName = booName;
    }

    public int getBooAutid() {
        return booAutid;
    }

    public void setBooAutid(int booAutid) {
        this.booAutid = booAutid;
    }
}
