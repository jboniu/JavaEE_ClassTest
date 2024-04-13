import com.itheima.dao.CampusCardMapper;
import com.itheima.pojo.CampusCard;
import com.itheima.pojo.MyBatisUtils;
import com.itheima.pojo.Student;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
@Slf4j
public class StudentTest {
//    嵌套查询
    @Test
    public void findStudentByIdTest() throws Exception{
        //1.获取资源核心配置文件
        InputStream is= Resources.getResourceAsStream("mybatis-config.xml");
        //2.创建sqlSessionFactory工厂对象
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
        //3.创建sqlSession对象
        SqlSession sqlSession=sqlSessionFactory.openSession();
        Student student=sqlSession.selectOne("com.itheima.mapper.StudentMapper.findStudentByStuId",111);
        log.info(student.toString());
        sqlSession.close();
    }

//    嵌套结果
    @Test
    public void findStudentById2Test() throws Exception{
//        InputStream is= Resources.getResourceAsStream("mybatis-config.xml");
//        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
//        SqlSession sqlSession=sqlSessionFactory.openSession();
        SqlSession sqlSession= MyBatisUtils.openSqlSession();
        Student student=sqlSession.selectOne("com.itheima.mapper.StudentMapper.findStudentByStuId2",222);
        log.info(student.toString());
//        sqlSession.commit();
//        sqlSession.close();
        MyBatisUtils.closeSqlSession(sqlSession);
    }

//######################################注解一对一####################################
//###################################################################################
//###################################################################################
    @Test
    public void selectCampusCardBycardId(){
        SqlSession sqlSession= MyBatisUtils.openSqlSession();
        CampusCardMapper campusCardMapper=sqlSession.getMapper(CampusCardMapper.class);
        CampusCard campusCard=campusCardMapper.selectCampusCardBycardId(111);
        System.out.println(campusCard.toString());
        sqlSession.close();
    }




}
