package edu.hut.zj.UML;

public abstract class BirdZj extends AnimalZj {
//    鸟与翅膀是组合关系，体现整体与部分间的关系，
//    但此时整体与部分是不可分的，整体的生命周期结束也就意味着部分的生命周期结束，
//    即翅膀在其内部组成。
    public SwingZj swing;
    public BirdZj(){
        this.swing=new SwingZj();
    }
    public abstract void layEggs();

}
