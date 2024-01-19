package com.example.petcare;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {

    private final PetRepository petRepository;

    @Autowired
    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public List<PetEntity> getAllPets() {
        return petRepository.findAll();
    }

    public PetEntity getPetById(Long id) {
        return petRepository.findById(id).orElse(null);
    }

    public void savePet(PetEntity pet) {
        petRepository.save(pet);
    }
    
    public void savePet(List<PetEntity> pets) {
        petRepository.saveAll(pets);
    }


    public void deletePet(Long id) {
        petRepository.deleteById(id);
    }

	/*
	 * public List<Pet> getAllPets() { // TODO Auto-generated method stub return
	 * null; }
	 */
}
