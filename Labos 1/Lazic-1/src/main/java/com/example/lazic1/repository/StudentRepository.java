package com.example.lazic1.repository;

import com.example.lazic1.domain.Student;
import com.example.lazic1.domain.StudentDTO;

import java.util.List;
import java.util.Optional;

public interface StudentRepository {

    List<Student> findAll();

    Optional<Student> findStudentByJMBAG(String jmbag);

    List<Student> filteredStudents();

}
