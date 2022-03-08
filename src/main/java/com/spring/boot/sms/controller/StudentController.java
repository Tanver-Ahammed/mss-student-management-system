package com.spring.boot.sms.controller;

import com.spring.boot.sms.entity.Student;
import com.spring.boot.sms.service.impl.StudentServiceImpl;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Data
public class StudentController {

    @Autowired
    private StudentServiceImpl studentService;

    // handler method to handle list of students and return model and view
    @GetMapping(path = "/students")
    public String getAllStudents(Model model) {
        model.addAttribute("students", this.getStudentService().getAllStudents());
        return "students";
    }

    @GetMapping("/students/new")
    public String createStudentForm(Model model) {

        // create student object to hold student form data
        Student student = new Student();
        model.addAttribute("student", student);
        return "create-student";
    }

    @PostMapping(path = "/students")
    public String saveStudent(@ModelAttribute("student") Student student) {
        this.getStudentService().saveStudent(student);
        return "redirect:/students";
    }

    @GetMapping(path = "/students/edit/{id}")
    public String editStudentForm(@PathVariable("id") Long id, Model model) {
        model.addAttribute("student", studentService.getStudentById(id));
        return "edit-student";
    }

    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable Long id,
                                @ModelAttribute("student") Student student,
                                Model model) {
        // get student from database by id
        Student existingStudent = studentService.getStudentById(id);
        existingStudent.setId(id);
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail(student.getEmail());

        // save updated student object
        studentService.updateStudent(existingStudent);
        return "redirect:/students";
    }

    // handler method to handle delete student request
    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.deleteStudentById(id);
        return "redirect:/students";
    }

}
