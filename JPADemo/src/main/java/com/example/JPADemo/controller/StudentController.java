package com.example.JPADemo.controller;

import com.example.JPADemo.dao.StudentRequest;
import com.example.JPADemo.entity.Student;
import com.example.JPADemo.entity.repo.StudentRepo;
import com.example.JPADemo.service.StdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/std")
public class StudentController {

    @Autowired
    StdService stdService;

      @Autowired
    StudentRepo studentRepo;
  @GetMapping("/get/{courseName}")
      public List<Student> getAllStudentByCourse(@PathVariable String courseName){
        List<Student> allStudentByCourse = stdService.getAllStudentByCourse(courseName);
        return allStudentByCourse;
      }
    @PostMapping("/save")
    public Student saveStudent(@RequestBody StudentRequest studentRequest){

     return  stdService.saveStdData(studentRequest);

    }
     @DeleteMapping("delete/{id}")
      public void deleteStudent(@PathVariable Integer id){
         stdService.deleteStudent(id);
      }

    @GetMapping("/get")
    public List<Student> getAllStudent(){
        List<Student> allStudent = stdService.getAllStudent();
        return allStudent;
    }
}
