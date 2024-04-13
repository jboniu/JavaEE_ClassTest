package edu.hut.zj.factoryMethod;

public class FactoryZjA implements FactoryZj {
    @Override
    public ProductZj createProduct() {
        return new ProductZjA();
    }
}
