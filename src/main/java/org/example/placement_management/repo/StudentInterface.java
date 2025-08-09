package org.example.placement_management.repo;

import org.example.placement_management.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentInterface extends JpaRepository<Student, Integer> {
}
