package org.example.dao;

import org.apache.ibatis.annotations.Select;
import org.example.pojo.Classes;

import java.util.List;

public interface TeacherMapper {
    @Select("select * from t_teacher where tea_id in(select tc_tcclaid from t_tcrelation where tc_tcteaid=#{teaId})")
    public List<Classes> selectTeacherByteaId(int teaId);
}
