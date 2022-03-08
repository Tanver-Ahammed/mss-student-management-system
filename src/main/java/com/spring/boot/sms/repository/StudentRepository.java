package com.spring.boot.sms.repository;

import com.spring.boot.sms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
