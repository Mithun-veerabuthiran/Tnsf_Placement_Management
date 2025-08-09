package org.example.placement_management.Service;

import org.example.placement_management.model.Student;
import org.example.placement_management.repo.StudentInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
@Autowired
StudentInterface s;
    public Student saveStudent(Student student) {
        return s.save(student);
    }

    public  Student getStudentById(int id) {
        return s.findById((int) id).orElse(null);
    }

    public void deleteStudent(int  id) {
        s.deleteById((int) id);
    }
    public  List<Student> getAllStudents() {
        return s.findAll();
    }
    public  Student updateStudent(int id, Student student) {
        if (s.existsById((int) id)) {
            student.setId(id);
            return s.save(student);
        }
        return null;
    }

}
