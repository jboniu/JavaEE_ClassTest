package edu.hut.zj.simpleFactory;
public class Main {
    public static void main(String[] args){
        //创建一个简单工厂对象，它负责根据参数创建具体的产品类对象。
        //这些产品类都实现了同一个接口ProductZj,对外提供了info方法
        SimpleFactoryZj simpleFactoryZj=new SimpleFactoryZj();
        ProductZj productZjA=simpleFactoryZj.createProduct("AAAA");
        productZjA.info();
        ProductZj productZjB=simpleFactoryZj.createProduct("BBBB");
        productZjB.info();
    }
}
