package com.itheima.pojo;

public class CampusCard {
    private int cardId;
    private String cardMajor;

    @Override
    public String toString() {
        return "campuscard{" +
                "cardId=" + cardId +
                ", cardMajor='" + cardMajor + '\'' +
                '}';
    }

    public int getCarfId() {
        return cardId;
    }

    public void setCarfId(int cardId) {
        this.cardId = cardId;
    }

    public String getCardMajor() {
        return cardMajor;
    }

    public void setCardMajor(String cardMajor) {
        this.cardMajor = cardMajor;
    }
}
