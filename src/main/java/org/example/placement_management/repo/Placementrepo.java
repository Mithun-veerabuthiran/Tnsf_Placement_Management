package org.example.placement_management.repo;

import org.example.placement_management.model.Placement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Placementrepo extends JpaRepository<Placement,Integer> {
}
