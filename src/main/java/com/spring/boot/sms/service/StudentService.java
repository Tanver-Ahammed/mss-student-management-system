package com.spring.boot.sms.service;

import com.spring.boot.sms.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Long studentId);

    Student updateStudent(Student student);

    void deleteStudentById(Long id);

}
