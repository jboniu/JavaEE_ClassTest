package edu.hut.zj.factoryMethod;

public class Main {
//    在工厂方法模式中，核心的工厂类不直接参与具体产品的创建，而是提供一种抽象的接口，
//    让子类根据需要创建具体的产品对象。
    public static void main(String[] args){
        FactoryZj factoryZjA =new FactoryZjA();
        ProductZj productZjA = factoryZjA.createProduct();
        productZjA.info();

        FactoryZj factoryZjB =new FactoryZjB();
        ProductZj productZjB = factoryZjB.createProduct();
        productZjB.info();
    }


}
