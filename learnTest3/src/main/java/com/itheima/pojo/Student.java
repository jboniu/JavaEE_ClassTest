package com.itheima.pojo;

public class Student {
    private int stuId;
    private String stuName;
    private String stuSex;
    private int stuAge;
    private CampusCard stuCard;

    @Override
    public String toString() {
        return "student{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", stuSex='" + stuSex + '\'' +
                ", stuAge=" + stuAge +
                ", stuCardid='" + stuCard + '\'' +
                '}';
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public CampusCard getStuCard() {
        return stuCard;
    }

    public void setStuCard(CampusCard stuCard) {
        this.stuCard = stuCard;
    }
}
