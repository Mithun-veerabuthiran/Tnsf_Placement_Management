package org.example.placement_management.repo;

import org.example.placement_management.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Userrepo extends JpaRepository<User,Integer> {
} // repo
