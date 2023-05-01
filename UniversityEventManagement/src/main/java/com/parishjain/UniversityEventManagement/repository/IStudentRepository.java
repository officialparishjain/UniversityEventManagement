package com.parishjain.UniversityEventManagement.repository;

import com.parishjain.UniversityEventManagement.models.Student;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepository extends CrudRepository<Student,Integer> {


    // Update the student department
    @Modifying
    @Query(value = "update student set STUDENT_DEPARTMENT = :department where STUDENT_ID =:id",nativeQuery = true)
    public void updateDepartmentById(String department, Integer id);


    @Modifying
    public void deleteStudentByStudentId(Integer id);

    public Boolean existsByStudentId(Integer id);

}
