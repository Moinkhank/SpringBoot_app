package com.example.JPADemo.dao;

import org.springframework.stereotype.Component;


public class StudentRequest {

    Integer id;

    String name;

    String Course;

    String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        Course = course;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return Dob;
    }

    public void setDob(String dob) {
        Dob = dob;
    }

    public String getEnrollmentNum() {
        return enrollmentNum;
    }

    public void setEnrollmentNum(String enrollmentNum) {
        this.enrollmentNum = enrollmentNum;
    }

    String Dob;

      String enrollmentNum;


}
