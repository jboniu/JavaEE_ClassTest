package edu.hut.zj.factoryMethod;

public class FactoryZjB implements FactoryZj {

    @Override
    public ProductZj createProduct() {
        return new ProductZjB();
    }
}
