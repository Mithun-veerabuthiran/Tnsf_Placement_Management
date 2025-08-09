package org.example.placement_management.controller;

import org.example.placement_management.Service.CertificationService;
import org.example.placement_management.model.Certification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/certifications")
public class CertificationController {

    @Autowired
    private CertificationService certificationService;

    // Create or Update certification
    @PostMapping
    public Certification saveCertification(@RequestBody Certification certification) {
        return certificationService.saveCertification(certification);
    }

    // Get all certifications
    @GetMapping
    public List<Certification> getAllCertifications() {
        return certificationService.getAllCertifications();
    }

    // Get certification by ID
    @GetMapping("/{id}")
    public ResponseEntity<Certification> getCertificationById(@PathVariable Long id) {
        return certificationService.getCertificationById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Delete certification by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCertification(@PathVariable Long id) {
        if (certificationService.getCertificationById(id).isPresent()) {
            certificationService.deleteCertification(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
