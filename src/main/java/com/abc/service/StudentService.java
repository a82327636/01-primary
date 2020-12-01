package com.abc.service;

import com.abc.bean.StudentDbBean;

public interface StudentService {

    void saveStudent(StudentDbBean student) throws Exception;

    StudentDbBean findStudentById(int id);

    Integer findStudentsCount();
}
