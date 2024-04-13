package edu.hut.zj.UML;

public class WildGooseZj extends BirdZj implements FlyZj {
    @Override
    public void fly() {
        System.out.println("实现接口Fly中fly()方法。");
    }

    @Override
    public void metabolise(OxygonZj O2, WaterZj water) {
        System.out.println("WildGoose继承动物，重写抽象方法metabolise()");
    }

    @Override
    public void reproduce() {
        System.out.println("WildGoose继承动物，重写抽象方法reproduce()。");
    }

    @Override
    public void layEggs() {
        System.out.println("WildGoose继承鸟类，重写抽象方法layEggs()。");
    }
}
