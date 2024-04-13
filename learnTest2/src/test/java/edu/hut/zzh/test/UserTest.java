package edu.hut.zzh.test;

import edu.hut.zzh.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import java.io.InputStream;
@Slf4j
public class UserTest {

    @Test

    public void findById() throws Exception
    {
        //1.获取资源核心配置文件
        InputStream is= Resources.getResourceAsStream("mybatis-config.xml");

        //2.创建sqlSessionFactory工厂对象
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
        //3.创建sqlSession对象
        SqlSession sqlSession=sqlSessionFactory.openSession();
        //4.执行sql语句,sql语句的唯一标识:namespace.statementId
        User user=sqlSession.selectOne("findById",1);
//        System.out.println(user);
        log.info("hello");
        log.info(user.toString());
        //5.释放资源
        sqlSession.close();
    }

}
