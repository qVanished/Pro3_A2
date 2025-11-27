package com.example.demo.controller;
import com.example.demo.DTO.AnimalDTO;
import com.example.demo.entities.Animal;
import com.example.demo.repository.IAnimalRegistrationService;
import com.example.demo.service.GrpcClient;
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
    private GrpcClient animalRegistrationService;

    @GetMapping("/{id}")
    public AnimalDTO getAnimalById(@PathVariable int id) {
        Optional<AnimalDTO> animal = animalRegistrationService.findById(id);
        return animal.orElse(null);
    }

    @GetMapping("/date/{date}")
    public List<AnimalDTO> getAnimalByDate(@PathVariable String date) {
        return animalRegistrationService.findByDate(LocalDate.parse(date));
    }

    @GetMapping("/origin/{origin}")
    public List<AnimalDTO> getAnimalByOrigin(@PathVariable String origin) {
        return animalRegistrationService.findByOrigin(origin);
    }
}
