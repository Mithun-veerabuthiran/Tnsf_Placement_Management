package org.example.placement_management.Controller;

import org.example.placement_management.Service.AdminService;
import org.example.placement_management.Service.collegeService;
import org.example.placement_management.model.Admin;
import org.example.placement_management.model.College;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/Admin")
@RestController
public class AdminController  {
    @Autowired
    private AdminService adminService;

    @RequestMapping("/ho")
    public String home() {
        return "Welcome to the Placement Management System";
    }
    @PostMapping
    public Admin createAdmin(@RequestBody Admin c) {
        return adminService.saveAdmin(c);
    }

    @GetMapping
    public List<Admin> getAllAdmin() {
        return adminService.getAlladmin();
    }
    @GetMapping("/{id}")
    public Admin getadminById(@PathVariable int id) {
        return adminService.getadminById((int) id);
    }
    @PutMapping("/{id}")
    public Admin updateadmin(@PathVariable int id, @RequestBody Admin college) {
        return adminService.updateadmin(id, college);
    }

}
