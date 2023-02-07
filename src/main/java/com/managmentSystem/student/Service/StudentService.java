package com.managmentSystem.student.Service;

import com.managmentSystem.student.Bean.Student;


import java.util.Optional;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student getStudent(String id);
    void addStudent(Student student);

    void deleteStudent(String id);


}
