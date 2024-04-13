package edu.hut.zj.UML;

public class PenguinZj extends BirdZj {
    public ClimateZj climate;

    public ClimateZj getClimate() {
        return climate;
    }

    public void setClimate(ClimateZj climate) {
        this.climate = climate;
    }

    @Override
    public void metabolise(OxygonZj O2, WaterZj water) {
        System.out.println("Penguin继承动物，重写抽象方法metabolise()");
    }

    @Override
    public void reproduce() {
        System.out.println("Penguin继承动物，重写抽象方法reproduce()。");
    }

    @Override
    public void layEggs() {
        System.out.println("Penguin继承鸟类，重写抽象方法layEggs()。");
    }
}
