package org.example.placement_management.Controller;

import org.example.placement_management.model.Placement;
import org.example.placement_management.Service.PlacementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/placements") // Base path for Placement endpoints
public class PlacementController {

    @Autowired
    private PlacementService placementService;

    @RequestMapping("/home")
    public String home() {
        return "Welcome to the Placement Management System - Placement Module";
    }

    @PostMapping
    public Placement createPlacement(@RequestBody Placement placement) {
        return placementService.savePlacement(placement);
    }

    @GetMapping
    public List<Placement> getAllPlacements() {
        return placementService.getAllPlacements();
    }

    @GetMapping("/{id}")
    public Placement getPlacementById(@PathVariable int id) {
        return placementService.getPlacementById(id);
    }

    @PutMapping("/{id}")
    public Placement updatePlacement(@PathVariable int id, @RequestBody Placement placement) {
        return placementService.updatePlacement(id, placement);
    }

    @DeleteMapping("/{id}")
    public String deletePlacement(@PathVariable int id) {
        placementService.deletePlacement(id);
        return "Placement with ID " + id + " deleted successfully.";
    }
}
