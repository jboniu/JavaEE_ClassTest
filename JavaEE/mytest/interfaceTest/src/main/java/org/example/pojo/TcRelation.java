package org.example.pojo;

public class TcRelation {
    private int tcId;
    private int tcTcTeaId;
    private int tcTcClaId;

    @Override
    public String toString() {
        return "TcRelation{" +
                "tcId=" + tcId +
                ", tcTcTeaId=" + tcTcTeaId +
                ", tcTcClaId=" + tcTcClaId +
                '}';
    }

    public int getTcId() {
        return tcId;
    }

    public void setTcId(int tcId) {
        this.tcId = tcId;
    }

    public int getTcTcTeaId() {
        return tcTcTeaId;
    }

    public void setTcTcTeaId(int tcTcTeaId) {
        this.tcTcTeaId = tcTcTeaId;
    }

    public int getTcTcClaId() {
        return tcTcClaId;
    }

    public void setTcTcClaId(int tcTcClaId) {
        this.tcTcClaId = tcTcClaId;
    }
}
