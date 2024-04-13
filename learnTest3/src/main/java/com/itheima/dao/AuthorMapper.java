package com.itheima.dao;

import com.itheima.pojo.Author;
import com.itheima.pojo.Book;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface AuthorMapper {
    @Select("select * from t_author where aut_id=#{autId}")
    @Results({@Result(id=true,column = "aut_id",property = "autId"),
    @Result(column = "aut_name",property = "autName"),
    @Result(column = "aut_country",property = "autCountry"),
    @Result(column = "aut_id",property = "bookList",
    many=@Many(select = "com.itheima.dao.BookMapper.selectBookByautId"))})
    public Author selectAuthorByautId(int autId);
}
