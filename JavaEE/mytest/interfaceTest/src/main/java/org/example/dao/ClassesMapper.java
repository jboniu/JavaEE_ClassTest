package org.example.dao;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.example.pojo.Classes;

public interface ClassesMapper {
    @Select("select * from t_classes where cla_id=#{claId}")
    @Results({@Result(id = true,column = "cla_id",property = "claId"),
    @Result(column = "cla_name",property = "claName"),
    @Result(column = "cla_count",property = "claCount"),
    @Result(column = "cla_teaid",property = "claTeaId"),
    @Result(column = "cla_teaid",property = "teacherList",
    many = @Many(select = "com.itheima.dao.TeacherMapper.selectTeacherByteaId"))
    })
    public Classes selectClassesByclaId(int claId);
}
