package org.example.placement_management.Service;

import org.example.placement_management.model.College;
import org.example.placement_management.repo.CollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class collegeService {

    @Autowired
    CollegeRepository collegeRepo;

    public College saveCollege(College  college) {
        return collegeRepo.save(college);
    }

    public College getCollegeById(int id) {
        return collegeRepo.findById( id).orElse(null);
    }

    public void deleteCollege(int id) {
        collegeRepo.deleteById( id);
    }

    public List<College> getAllColleges() {
        return collegeRepo.findAll();
    }

    public College updateCollege(int id, College college) {
        if (collegeRepo.existsById( id)) {
            college.setCollegeId(id);
            return collegeRepo.save(college);
        }
        return null;
    }
}
