package org.example.placement_management.Service;

import org.example.placement_management.model.Placement;

import org.example.placement_management.repo.Placementrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlacementService {

    @Autowired
    private Placementrepo placementrepo;

    // Create or Save a Placement
    public Placement savePlacement(Placement placement) {
        return placementrepo.save(placement);
    }

    // Get a Placement by ID
    public Placement getPlacementById(int id) {
        return placementrepo.findById(id).orElse(null);
    }

    // Delete a Placement by ID
    public void deletePlacement(int id) {
        placementrepo.deleteById(id);
    }

    // Get all Placements
    public List<Placement> getAllPlacements() {
        return placementrepo.findAll();
    }

    // Update an existing Placement
    public Placement updatePlacement(int id, Placement placement) {
        if (placementrepo.existsById(id)) {
            placement.setId(id); // Ensure correct ID
            return placementrepo.save(placement);
        }
        return null;
    }
}
