package org.example.mapper;

import org.apache.ibatis.annotations.Select;
import org.example.pojo.User;

public interface UserMapper {
    public void insertById(User user);
    public void updateUser(User user);
    public void delectUser(int userId);
    public  void findById(int userId);

}
