package org.example.placement_management.Controller;

import org.example.placement_management.model.Student;
import org.example.placement_management.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Studentcontroller {
    @Autowired
    private StudentService StudentService;
    @RequestMapping("/ho")
    public String home() {
        return "Welcome to the Placement Management System";
    }
    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return StudentService.saveStudent(student);
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return StudentService.getAllStudents();
    }
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id) {
        return StudentService.getStudentById(id);
    }
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody Student student) {
        return StudentService.updateStudent(id, student);
    }


}
