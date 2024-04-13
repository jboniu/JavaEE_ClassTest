package edu.hut.zj.UML;

public class DonDonaldZj extends DuckZj implements SpeakZj {
    @Override
    public void say() {
        System.out.println("实现接口SpeakZj中say()方法");
    }
}
