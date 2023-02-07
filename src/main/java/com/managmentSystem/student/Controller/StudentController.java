package com.managmentSystem.student.Controller;

import com.managmentSystem.student.Bean.Student;
import com.managmentSystem.student.Service.ServiceImp.StudentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private final StudentServiceImp studentServiceImp;

    public StudentController(StudentServiceImp studentServiceImp) {
        this.studentServiceImp = studentServiceImp;
    }



    @GetMapping()
    public String ListStudents(Model model) {
        model.addAttribute("students",studentServiceImp.getAllStudents());
        return "students";
    }

    @GetMapping("/new")
    public String createNewStudent(Model model)
    {
        Student student =new Student();
        model.addAttribute("student",student);
        return "create_student";
    }

     @PostMapping()
    public String addNewStudent(@ModelAttribute("student") Student student)
     {
         studentServiceImp.addStudent(student);
         return "redirect:/students";
     }

    @PostMapping("{id}")
    public String deleteStudent(@PathVariable("id") String id)
    {
        studentServiceImp.deleteStudent(id);
        return "redirect:/students";
    }

    @PostMapping("/edit/{id}")
        public String edit(@PathVariable("id") String id,Model model)
    {
        Student student =studentServiceImp.getStudent(id);
        model.addAttribute("student",student);
        return "update_student";


    }

}
