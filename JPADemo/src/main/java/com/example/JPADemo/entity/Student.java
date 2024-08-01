package com.example.JPADemo.entity;

import javax.persistence.*;


@Entity
@Table(name="students")
public class Student {

    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    @Column(name="name")
    String name;

    @Column(name="Course")
    String course;

    @Column(name="Address")
    String Address;

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
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
