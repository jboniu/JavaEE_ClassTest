package org.example.pojo;

import java.util.List;

public class Classes {
    private int claId;
    private String claName;
    private int claCount;
    private int claTeaId;
    private List<Teacher> teacherList;

    @Override
    public String toString() {
        return "Classes{" +
                "claId=" + claId +
                ", claName='" + claName + '\'' +
                ", claCount=" + claCount +
                ", claTeaId=" + claTeaId +
                ", teacherList=" + teacherList +
                '}';
    }

    public int getClaId() {
        return claId;
    }

    public void setClaId(int claId) {
        this.claId = claId;
    }

    public String getClaName() {
        return claName;
    }

    public void setClaName(String claName) {
        this.claName = claName;
    }

    public int getClaCount() {
        return claCount;
    }

    public void setClaCount(int claCount) {
        this.claCount = claCount;
    }

    public int getClaTeaId() {
        return claTeaId;
    }

    public void setClaTeaId(int claTeaId) {
        this.claTeaId = claTeaId;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }
}
