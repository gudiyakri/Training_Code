package com.code.dao;

import java.util.List;

import com.code.model.StudentModel;

public interface StudentDao {
public List<StudentModel>getAllStudent();
void saveStudent(StudentModel student);
}
