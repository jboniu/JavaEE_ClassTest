package org.example.mapper;

import org.example.pojo.Teacher;

import java.util.List;

public interface TeacherMapper {
//    嵌套结果
    public List<Teacher> findTeacherWithClasses(int claId);
//    嵌套查询
    public List<Teacher> findTeacherWithClasses2(int claId);
}
