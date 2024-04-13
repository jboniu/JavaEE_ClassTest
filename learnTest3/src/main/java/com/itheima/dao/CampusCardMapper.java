package com.itheima.dao;

import com.itheima.pojo.CampusCard;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface CampusCardMapper {
    @Select("select * from t_campuscard where card_id=#{cardId}")
    @Results({@Result(column = "stu_cardid",property = "stuCard",
    one=@One(select = "com.itheima.dao.StudentMapper.selectCampusCdrdByStuId"))})
    public CampusCard selectCampusCardBycardId(int cardId);
}
