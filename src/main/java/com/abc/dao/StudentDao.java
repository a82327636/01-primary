package com.abc.dao;

import com.abc.bean.StudentDbBean;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentDao {
    void insertStudent(StudentDbBean student);

    StudentDbBean selectStudentById(int id);

    Integer selectStudentsCount();
}
