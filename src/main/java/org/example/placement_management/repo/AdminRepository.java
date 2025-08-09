package org.example.placement_management.repo;

import org.example.placement_management.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository  extends JpaRepository<Admin,Integer> {
}
