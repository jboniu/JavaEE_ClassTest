package edu.hut.zj.UML;

public class WildGeeseZj {
//    聚合它体现的是整体与部分的关系，此时整体与部分之间是可分离的，
//    它们可以具有各自的生命周期，部分可以属于多个整体对象，也可以为多个整体对象共享。
//    即大雁与群燕可分离开。
    public WildGooseZj wildGoose;
    public WildGeeseZj(WildGooseZj wildGoose){
        this.wildGoose=wildGoose;
    }
    public void Vfly(){
        System.out.println("V形飞行");
    }
    public void Yfly(){
        System.out.println("一形飞行");
    }
}
