package com.parishjain.UniversityEventManagement.service;

import com.parishjain.UniversityEventManagement.models.Student;
import com.parishjain.UniversityEventManagement.repository.IStudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    IStudentRepository studentRepository;

    public String saveStudents(List<Student> students) {
        Iterable<Student> stdList = studentRepository.saveAll(students);
        if(stdList != null) return "Added";
        else return "Not Added, Please Check...";
    }

    @Transactional
    public String updateStudentDepartmentById(String department, Integer id) {
         studentRepository.updateDepartmentById(department,id);
         return "Updated";
    }


    public Iterable<Student> fetchAllStudents() {
        // Crud Repo Method Used
        return studentRepository.findAll();
    }

    @Transactional
    public String deleteStudentById(Integer id) {
        boolean present = studentRepository.existsByStudentId(id);
        if(present){
            studentRepository.deleteStudentByStudentId(id);
            return "Deleted";
        }
        else return "This Id student not Present in DataBase... Check id again...";

    }

    public Student fetchStudentById(Integer id) {
        Optional<Student> optionalStudent = studentRepository.findById(id);
        if(optionalStudent.isPresent()) return optionalStudent.get();
        else return null;
    }
}
