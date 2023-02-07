package com.managmentSystem.student.Service.ServiceImp;

import com.managmentSystem.student.Bean.Student;
import com.managmentSystem.student.Repository.StudentRepository;
import com.managmentSystem.student.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImp implements StudentService {

    @Autowired
    private final StudentRepository studentRepository;

    public StudentServiceImp(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }



    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudent(String id) {
        Student st=studentRepository.getById(id);
        return st;
    }

    @Override
    public void addStudent(Student student) {
        studentRepository.save(student);


    }



    @Override
    public void deleteStudent(String id) {
        studentRepository.deleteById(id);

    }


}
