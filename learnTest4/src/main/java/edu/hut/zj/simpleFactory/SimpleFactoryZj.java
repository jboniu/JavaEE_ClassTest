package edu.hut.zj.simpleFactory;

public class SimpleFactoryZj {
    public ProductZj createProduct(String type){
        if(type.equals("AAAA")){
            return new ProductZjA();
        } else if (type.equals("BBBB")) {
            return new ProductZjB();
        }else {
            System.out.println("error");
            return null;
        }
    }
}
