package org.example.placement_management.Service;

import org.example.placement_management.model.Admin;
import org.example.placement_management.model.College;
import org.example.placement_management.repo.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    AdminRepository s;
    public Admin saveAdmin(Admin student) {
        return s.save(student);
    }

    public Admin getadminById(int id) {
        return s.findById((int) id).orElse(null);
    }

    public void deleteadmin(int  id) {
        s.deleteById((int) id);
    }
    public List<Admin> getAlladmin() {
        return s.findAll();
    }
    public Admin updateadmin(int id, Admin student) {
        if (s.existsById((int) id)) {
            student.setId(id);
            return s.save(student);
        }
        return null;
    }

}
