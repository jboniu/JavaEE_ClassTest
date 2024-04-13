package edh.hut.zj;

import edu.hut.zj.controller.BookController;
import edu.hut.zj.pojo.Book1;
import edu.hut.zj.pojo.Book2;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
public class MyTest {
    //    Book2:采用构造方法实现注入（即给属性赋值）
    @Test
    public void Book1Test(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext-Book1.xml");
        Book1 book1=(Book1) applicationContext.getBean("book1");
        log.info(book1.toString());
    }

    //    Book2:采用setter方法实现注入（即给属性赋值）
    @Test
    public void Book2Test(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext-Book2.xml");
        Book2 book2=(Book2) applicationContext.getBean("book2");
        log.info(book2.toString());
    }

    //      配置常用bean元素子元素示例
    @Test
    public void BookTest(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        BookController bookController=(BookController) applicationContext.getBean("bookController");
        bookController.isBook("YUHUA");
    }

    @Test
    public void SingleTon(){
//        未调用对象但已经创建完成
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext-Book1.xml");
        Object book1 = applicationContext.getBean("book1");
        Object book2 = applicationContext.getBean("book1");
//          即singleton只有一个对象
        System.out.println(book1.equals(book2) );

    }


    @Test
    public void Prototype(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext-Book1.xml");
        Object book1 = applicationContext.getBean("book1");
        Object book2 = applicationContext.getBean("book1");
//          即prototype每次调用方法都会创建实例
        System.out.println(book1.equals(book2) );
    }

    @Test
    public void Book1Init(){
        //        未调用对象但已经创建完成
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext-Book1.xml");
    }
    @Test
    public void Book1LazyInit(){

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext-Book1.xml");
    }

    @Test
    public void BookInitError(){

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        BookController bookController=(BookController) applicationContext.getBean("bookController");
        bookController.isBook("YUHUA");
    }
}
