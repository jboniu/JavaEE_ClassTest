package org.example.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.example.pojo.User;

public interface UsersMapper {
    @Select("select * from users where user_id=#{userId}")
    public User selectUser(int userId);

    @Insert("insert into users(user_id,user_name,user_age) values (#{userId},#{userName},#{userAge})")
    public int insertUser(User user);
}
