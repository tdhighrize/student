package org.dhbw.service.student.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.dhbw.service.student.model.Student;


@RestController
public class StudentController {

    
@GetMapping("/student")
public Student getStudent() {
    Student newStudent = new Student(1, "Thomas", "Tester", "4711");
    return newStudent;
}
    
}