package com.parishjain.UniversityEventManagement.controller;

import com.parishjain.UniversityEventManagement.models.Student;
import com.parishjain.UniversityEventManagement.service.EventService;
import com.parishjain.UniversityEventManagement.service.StudentService;
import jakarta.persistence.GeneratedValue;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/univ/student")
public class StudentController {



    @Autowired
    StudentService studentService;

    // Adding the Student
    @PostMapping(value = "/add")
    public String addStudent(@Valid @RequestBody List<Student> students){
        return studentService.saveStudents(students);
    }

    // Update the Student Department
    @PutMapping(value = "/update/department/{department}/id/{id}")
    public String updateStudentDepartment(@PathVariable String department , @PathVariable Integer id){
        return studentService.updateStudentDepartmentById(department,id);
    }

    // delete Student
    @DeleteMapping(value = "/delete/id/{id}")
    public String deleteStudentById(@PathVariable Integer id){
        return studentService.deleteStudentById(id);
    }

    // Get All Students
    @GetMapping(value = "/all")
    public Iterable<Student> getAllStudents(){
        return studentService.fetchAllStudents();
    }

    // Get Student By Id
    @GetMapping(value = "/id/{id}")
    public Student getStudentById(@PathVariable Integer id){
        return studentService.fetchStudentById(id);
    }




}
