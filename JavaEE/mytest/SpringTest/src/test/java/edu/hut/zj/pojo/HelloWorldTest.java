package edu.hut.zj.pojo;

import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HelloWorldTest {
    @Test
    public void HelloTest(){
//        初始化spring容器，加载applicationContext.xml配置
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
//        通过容器获取配置中的HelloWorld实例
        HelloWorld helloWorld=(HelloWorld) applicationContext.getBean("HelloWorld");
        helloWorld.show();
    }
}