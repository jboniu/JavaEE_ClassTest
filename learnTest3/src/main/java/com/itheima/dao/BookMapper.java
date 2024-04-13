package com.itheima.dao;

import com.itheima.pojo.Book;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BookMapper {
    @Select("select * from t_book where boo_autid=#{booAutid}")
    @Results({@Result(id = true,column = "boo_id",property = "booId"),
            @Result(column = "boo_name",property = "booName")})
    public List<Book> selectBookByautId(int autId);
}
