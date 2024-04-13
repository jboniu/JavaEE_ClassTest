package edu.hut.zj.UML;

public class DuckZj extends BirdZj {

    @Override
    public void metabolise(OxygonZj O2, WaterZj water) {
        System.out.println("Duck继承动物，重写抽象方法metabolise()");
        O2.info();
        water.info();
    }

    @Override
    public void reproduce() {
        System.out.println("Duck继承动物，重写抽象方法reproduce()。");
    }

    @Override
    public void layEggs() {
        System.out.println("Duck继承鸟类，重写抽象方法layEggs()。");
    }
}
