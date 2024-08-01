package com.example.JPADemo.service;

import com.example.JPADemo.dao.StudentRequest;
import com.example.JPADemo.entity.Student;
import com.example.JPADemo.entity.repo.StudentRepo;
import com.example.JPADemo.util.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StdServiceImpl implements StdService {

    @Autowired
    StudentRepo studentRepo;

    @Override
    public List<Student> getAllStudentByCourse(String courseName)  {
        return  studentRepo.findByCourse(courseName);
    }

    @Override
    public Student saveStdData(StudentRequest studentRequest) {
      return studentRepo.save(Utility.Mapper(studentRequest));
    }

    @Override
    public void deleteStudent(Integer id) {
       studentRepo.deleteById(id);
    }

    @Override
    public List<Student> getAllStudent() {
       return  studentRepo.getAllStudentData();
    }


}
