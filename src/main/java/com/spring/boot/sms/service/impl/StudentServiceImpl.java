package com.spring.boot.sms.service.impl;

import com.spring.boot.sms.entity.Student;
import com.spring.boot.sms.repository.StudentRepository;
import com.spring.boot.sms.service.StudentService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return this.getStudentRepository().findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return this.getStudentRepository().save(student);
    }

    @Override
    public Student getStudentById(Long studentId) {
        return studentRepository.findById(studentId).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }

}
