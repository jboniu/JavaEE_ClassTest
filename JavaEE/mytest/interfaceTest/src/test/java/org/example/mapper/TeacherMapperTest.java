package org.example.mapper;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.dao.UsersMapper;
import org.example.pojo.Classes;
import org.example.pojo.MyBatisUtils;
import org.example.pojo.Teacher;
import org.example.pojo.User;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

@Slf4j
public class TeacherMapperTest {
    //###################################多对多########################################
// #################################################################################
// #################################################################################
// #################################################################################
@Test
    public void testFindClassesWithTeacher() throws  Exception{
    ClassesMapper classesMapper=null;
    TeacherMapper teacherMapper=null;
    TeacherMapper teacherMapper2=null;
    InputStream is= Resources.getResourceAsStream("mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
    SqlSession sqlSession=sqlSessionFactory.openSession();
//获取接口的动态代理对象
    classesMapper=sqlSession.getMapper(ClassesMapper.class);
    List<Classes> classes = classesMapper.findClassesWithTeacher(1);
//获取接口的动态代理对象
    teacherMapper=sqlSession.getMapper(TeacherMapper.class);
    List<Teacher> teacher = teacherMapper.findTeacherWithClasses(2101);

    teacherMapper2=sqlSession.getMapper(TeacherMapper.class);
    List<Teacher> teacher2 = teacherMapper2.findTeacherWithClasses2(1);
    System.out.println("************************************通过教师号查询班级(嵌套结果)**************************************");
    log.info(classes.toString());

    System.out.println("************************************通过班级号查询教师(嵌套结果)**************************************");
    log.info(teacher.toString());

    System.out.println("************************************通过教师号查询班级(嵌套查询)**************************************");
    log.info(teacher2.toString());

    sqlSession.close();

    }



//    使用工具类直接生成sqlSession
    @Test
    public void test2(){
    ClassesMapper classesMapper=null;
    SqlSession sqlSession= MyBatisUtils.openSqlSession();
        //获取接口的动态代理对象
        classesMapper=sqlSession.getMapper(ClassesMapper.class);
        List<Classes> classes = classesMapper.findClassesWithTeacher(1);
        System.out.println("************************************通过教师号查询班级(嵌套结果)**************************************");
//        log.info(classes.toString());
        classes.forEach(System.out::println);
        MyBatisUtils.closeSqlSession(sqlSession);
    }

    //###################################接口方法实现增删改查########################################
// #################################################################################
// #################################################################################
// #################################################################################
    @Test
    public void insertById() {
        User user = new User();
        user.setUserId(5);
        user.setUserName("插入1");
        user.setUserAge(9);
        SqlSession sqlSession = MyBatisUtils.openSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.insertById(user);
        //手动提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateUser(){
        User user = new User();
        user.setUserId(5);
        user.setUserAge(111);
        SqlSession sqlSession = MyBatisUtils.openSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.updateUser(user);
        //手动提交事务
        sqlSession.commit();
        sqlSession.close();
    }


    @Test
    public void delectUser(){
//        User user = new User();
        SqlSession sqlSession = MyBatisUtils.openSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.delectUser(5);
        //手动提交事务
        sqlSession.commit();
        sqlSession.close();
    }



//###################################二级缓存########################################
// #################################################################################
// #################################################################################
// #################################################################################
    @Test
    public void findById(){
        SqlSession sqlSession1 = MyBatisUtils.openSqlSession();
        SqlSession sqlSession2 = MyBatisUtils.openSqlSession();

        System.out.println("*******************第一次查询**********************");
        User user1=sqlSession1.selectOne("org.example.mapper.UserMapper.findById",1);
        System.out.println(user1);
        sqlSession1.close();
//        释放第一次sqlsession，将数据写入二级缓存
        System.out.println("*******************第二次查询**********************");
        User user2=sqlSession2.selectOne("org.example.mapper.UserMapper.findById",1);
        System.out.println(user2);
        sqlSession2.close();
    }

//###################################注解方法实现增删改查########################################
// #################################################################################
// #################################################################################
// #################################################################################
    @Test
    public void selectUser(){
    SqlSession sqlSession=MyBatisUtils.openSqlSession();
    UsersMapper usersMapper=sqlSession.getMapper(UsersMapper.class);
    User user=usersMapper.selectUser(1);
    System.out.println(user.toString());
    sqlSession.close();
    }
@Test
    public void insertUser(){
        SqlSession sqlSession=MyBatisUtils.openSqlSession();
        UsersMapper usersMapper=sqlSession.getMapper(UsersMapper.class);

        User user=new User();
        user.setUserId(66);
        user.setUserName("插入2");
        user.setUserAge(123);
        int count=usersMapper.insertUser(user);
        System.out.println("共插入数据"+count+"条。");
        System.out.println(user.toString());
        sqlSession.close();
    }

    //###################################注解方法实现多对多########################################
// #################################################################################
// #################################################################################
// #################################################################################
    @Test
    public void selectClassesByclaId(){
//    ***************************************************
//    ***********************未成功***********************
//    ***************************************************

        SqlSession sqlSession=MyBatisUtils.openSqlSession();
        org.example.dao.ClassesMapper classesMapper=sqlSession.getMapper(org.example.dao.ClassesMapper.class);
        Classes classes=classesMapper.selectClassesByclaId(2101);
        System.out.println(classes.toString());
        sqlSession.close();
    }

}