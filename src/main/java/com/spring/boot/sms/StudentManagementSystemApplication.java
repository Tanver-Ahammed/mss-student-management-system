package com.spring.boot.sms;

import com.spring.boot.sms.entity.Student;
import com.spring.boot.sms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        Student student1 = new Student("Tanver", "Ahammed", "tanvermbstuit16@gamil.com");
//        this.studentRepository.save(student1);
//
//        Student student2 = new Student("Sheuly", "Akter", "sheulymbstuit16@gamil.com");
//        this.studentRepository.save(student2);
//
//        Student student3 = new Student("Tariq", "Islam", "tariqmbstuit16@gamil.com");
//        this.studentRepository.save(student3);
//
//        Student student4 = new Student("Fatema", "Bonna", "bonnambstuit16@gamil.com");
//        this.studentRepository.save(student4);
//
//        Student student5 = new Student("Shazid", "Utsha", "utshambstuit16@gamil.com");
//        this.studentRepository.save(student5);

    }
}
