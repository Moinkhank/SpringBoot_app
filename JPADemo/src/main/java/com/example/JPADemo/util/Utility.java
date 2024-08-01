package com.example.JPADemo.util;

import com.example.JPADemo.dao.StudentRequest;
import com.example.JPADemo.entity.Student;

public class Utility {

    public static Student Mapper(StudentRequest studentRequest){
          Student student = new Student();
           student.setName(studentRequest.getName());
           student.setAddress(studentRequest.getAddress());
           student.setCourse(studentRequest.getCourse());
           return student;
    }
}
