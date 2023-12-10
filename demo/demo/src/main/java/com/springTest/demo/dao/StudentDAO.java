package com.springTest.demo.dao;

import com.springTest.demo.model.Student;
import com.springTest.demo.repository.StudentRepository;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAO {

    StudentRepository studentRepository;

    public StudentDAO(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }
}
