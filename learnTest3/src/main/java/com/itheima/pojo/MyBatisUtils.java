package com.itheima.pojo;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

//工具类：私有化构造器+静态方法
public class MyBatisUtils {

    //私有化构造方法
    private MyBatisUtils(){}

    //创建工厂类对象
    private  static SqlSessionFactory sqlSessionFactory=null;

    //随着类的执行只加载一次
    static {

        try {
            InputStream  is = Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //静态方法，返回SqlSession对象
    public static SqlSession openSqlSession(){
        return sqlSessionFactory.openSession();//默认事务
    }

    public static SqlSession openSqlSession(boolean flag){
        return sqlSessionFactory.openSession(flag);//根据参数指定事务
    }

    //静态方法  关闭SqlSession
    public static void closeSqlSession(SqlSession sqlSession){
        if (sqlSession != null){
            sqlSession.close();
        }
    }
}
