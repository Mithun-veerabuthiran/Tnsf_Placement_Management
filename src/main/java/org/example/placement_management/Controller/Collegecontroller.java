package org.example.placement_management.Controller;


import org.example.placement_management.Service.collegeService;
import org.example.placement_management.model.College;
import org.example.placement_management.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/colleges")
@RestController
public class Collegecontroller {
    @Autowired
    private collegeService collegeService;
    @RequestMapping("/ho")
    public String home() {
        return "Welcome to the Placement Management System";
    }
    @PostMapping
    public College createcollege(@RequestBody College college) {
        return collegeService.saveCollege(college);
    }

    @GetMapping
    public List<College> getAllColleges() {
        return collegeService.getAllColleges();
    }
    @GetMapping("/{id}")
    public College getcolegeById(@PathVariable int id) {
        return collegeService.getCollegeById(id);
    }
    @PutMapping("/{id}")
    public College updatecollge(@PathVariable int id, @RequestBody College college) {
        return collegeService.updateCollege(id, college);
    }
}
