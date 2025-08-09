package org.example.placement_management.Service;

import org.example.placement_management.model.Certification;
import org.example.placement_management.repo.Certificationrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CertificationService {

    @Autowired
    private Certificationrepo certificationRepo;

    // Save or update certification
    public Certification saveCertification(Certification certification) {
        return certificationRepo.save(certification);
    }

    // Get all certifications
    public List<Certification> getAllCertifications() {
        return certificationRepo.findAll();
    }

    // Get certification by ID
    public Optional<Certification> getCertificationById(Long id) {
        return certificationRepo.findById(Math.toIntExact(id));
    }

    // Delete certification by ID
    public void deleteCertification(Long id) {
        certificationRepo.deleteById(Math.toIntExact(id));
    }
}