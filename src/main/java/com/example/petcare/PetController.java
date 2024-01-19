package com.example.petcare;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pets")
public class PetController {

    private final PetService petService;

    @Autowired
    public PetController(PetService petService) {
        this.petService =petService;
    }
    @GetMapping
    public List<PetEntity> getAllPets() {
        return petService.getAllPets();
    }

    @GetMapping("/{id}")
    public PetEntity getPetById(@PathVariable Long id) {
        return petService.getPetById(id);
    }

    @PostMapping
    public void savePet(@RequestBody PetEntity pet) {
        petService.savePet(pet);
    }
    
    @PostMapping("/pets")
    public void savePet(@RequestBody List<PetEntity> pets) {
        petService.savePet(pets);
    }


    @DeleteMapping("/{id}")
    public void deletePet(@PathVariable Long id) {
        petService.deletePet(id);
    }
}
