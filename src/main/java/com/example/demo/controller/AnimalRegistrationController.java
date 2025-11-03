package com.example.demo.controller;
import com.example.demo.DTO.AnimalDTO;
import com.example.demo.entities.Animal;
import com.example.demo.repository.IAnimalRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/animals")
public class AnimalRegistrationController {
    @Autowired
    private IAnimalRegistrationService animalRegistrationService;

    @GetMapping("/{id}")
    public AnimalDTO getAnimalById(@PathVariable int id) {
        Optional<Animal> animal = animalRegistrationService.findById(id);
        return new AnimalDTO(animal.orElse(new Animal()));
    }

    @GetMapping("/date/{date}")
    public List<AnimalDTO> getAnimalByDate(@PathVariable String date) {
        List<Animal> animals = animalRegistrationService.findByDate(LocalDate.parse(date));
        List<AnimalDTO> animalDTOs = new ArrayList<>();
        for(Animal animal : animals) {
            animalDTOs.add(new AnimalDTO(animal));
        }
        return animalDTOs;
    }

    @GetMapping("/origin/{origin}")
    public List<AnimalDTO> getAnimalByOrigin(@PathVariable String origin) {
        List<Animal> animals = animalRegistrationService.findByOrigin(origin);
        List<AnimalDTO> animalDTOs = new ArrayList<>();
        for(Animal animal : animals) {
            animalDTOs.add(new AnimalDTO(animal));
        }
        return animalDTOs;
    }
}
