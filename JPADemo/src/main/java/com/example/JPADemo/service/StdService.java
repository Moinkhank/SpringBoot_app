package com.example.JPADemo.service;

import com.example.JPADemo.dao.StudentRequest;
import com.example.JPADemo.entity.Student;

import java.util.List;

public interface StdService {

    public  List<Student> getAllStudentByCourse( String courseName);

    public Student saveStdData(StudentRequest studentRequest);

    void deleteStudent(Integer id);

    List<Student> getAllStudent();
}
