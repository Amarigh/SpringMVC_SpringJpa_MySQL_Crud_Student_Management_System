package com.managmentSystem.student.Service;

import com.managmentSystem.student.Bean.Student;
import com.managmentSystem.student.Service.ServiceImp.StudentServiceImp.studentRecord;

import java.util.Optional;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student getStudent(String id);
    void addStudent(Student student);
    void editStudent(String id , studentRecord student);
    void deleteStudent(String id);


}
