package com.itheima.dao;

import com.itheima.pojo.CampusCard;
import org.apache.ibatis.annotations.Select;

public interface StudentMapper {
    @Select("select * from t_student where stu_id=#{stuId}")
    public CampusCard selectCampusCdrdByStuId(int stuId);
}
