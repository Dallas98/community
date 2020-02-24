package com.dallas.community.mapper;

import com.dallas.community.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @program: community
 * @description:
 * @author: Dallas
 * @create: 2019-12-31 15:10
 */

@Mapper
public interface QuestionMapper {
    @Insert("insert into question (title,description,gmt_create,gmt_modified,creator,tag) " +
            "values (#{title},#{description},#{gmt_create},#{gmt_modified},#{creator},#{tag})")
    void create(Question question);

    @Select("select * from question limit #{offset},#{size}")
    List<Question> list(@Param(value = "offset") Integer offset, @Param(value = "size") Integer size);
    @Select("select count(1) from question")
    Integer count();

    @Select("select * from question where creator=#{userId} limit #{size}")
    List<Question> listByUserId(@Param("userId") Integer userId, @Param(value = "offset") Integer offset, @Param(value = "size") Integer size);

    @Select("select count(1) from question where creator = #{userId}")
    Integer countByUserId(@Param("userId") Integer userId);
}
