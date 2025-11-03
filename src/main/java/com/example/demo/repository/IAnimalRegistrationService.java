package com.example.demo.repository;
import com.example.demo.entities.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface IAnimalRegistrationService extends JpaRepository<Animal, Integer> {
    List<Animal> findByDate(LocalDate date);
    List<Animal> findByOrigin(String origin);
}
