package com.topclass.workbox.mapper;

import com.topclass.workbox.dto.Homework;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface HomeworkMapper {

    @Select("SELECT id, title, subject_id, finish_date FROM Homework WHERE subject_id = #{subject_id}")
    List<Homework> selectHomework(@Param("subject_id") final String subject_id);

    @Select("SELECT id, title, subject_id, finish_date FROM HomeworkPersonal WHERE subject_id = #{subject_id} AND user_id = #{user_id}")
    List<Homework> selectHomeworkPersonal(@Param("subject_id") final String subject_id, @Param("user_id") final String user_id);
}
