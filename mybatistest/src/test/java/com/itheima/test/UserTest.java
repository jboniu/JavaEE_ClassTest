package com.itheima.test;

import com.itheima.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class UserTest {
    @Test
    public void findById() throws Exception
    {
        //1.获取资源核心配置文件
        InputStream is=Resources.getResourceAsStream("mybatis-config.xml");

        //2.创建sqlSessionFactory工厂对象
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
        //3.创建sqlSession对象
        SqlSession sqlSession=sqlSessionFactory.openSession();
        //4.执行sql语句,sql语句的唯一标识:namespace.statementId
        User user=sqlSession.selectOne("com.itheima.pojo.User.findById",1);
        System.out.println(user);
        //5.释放资源
        sqlSession.close();
    }
}
