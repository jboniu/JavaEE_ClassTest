package org.example.pojo;

import java.util.List;

public class Teacher {
    private int teaId;
    private String teaName;
    private String teaSubject;
    private List<Classes> classesList;

    @Override
    public String toString() {
        return "Teacher{" +
                "teaId=" + teaId +
                ", teaName='" + teaName + '\'' +
                ", teaSubject='" + teaSubject + '\'' +
                ", classesList=" + classesList +
                '}';
    }

    public int getTeaId() {
        return teaId;
    }

    public void setTeaId(int teaId) {
        this.teaId = teaId;
    }

    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName;
    }

    public String getTeaSubject() {
        return teaSubject;
    }

    public void setTeaSubject(String teaSubject) {
        this.teaSubject = teaSubject;
    }

    public List<Classes> getClassesList() {
        return classesList;
    }

    public void setClassesList(List<Classes> classesList) {
        this.classesList = classesList;
    }
}
