package org.example.mapper;

import org.example.pojo.Classes;
import org.example.pojo.Teacher;

import java.util.List;

public interface ClassesMapper {
//    方法名要与映射文件elect中的id一致
    public List<Classes> findClassesWithTeacher(int teaId);
}
