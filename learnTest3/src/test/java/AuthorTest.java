import com.itheima.dao.AuthorMapper;
import com.itheima.pojo.Author;
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
public class AuthorTest {

    @Test
    public void findAuthorByNameTest() throws Exception{
        InputStream is= Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        Author author=sqlSession.selectOne("com.itheima.mapper.AuthorMapper.findAuthorWithBook",2);
        log.info(author.toString());
        sqlSession.close();
    }

    //######################################注解一对多####################################
//###################################################################################
//###################################################################################
@Test
    public void selectAuthorByautId(){
        SqlSession sqlSession= MyBatisUtils.openSqlSession();
        AuthorMapper authorMapper=sqlSession.getMapper(AuthorMapper.class);
        Author author=authorMapper.selectAuthorByautId(2);
        System.out.println(author.toString());
        sqlSession.close();
}
}
