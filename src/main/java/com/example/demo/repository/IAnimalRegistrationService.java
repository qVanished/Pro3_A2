package com.example.demo.repository;
import com.example.demo.entities.Animal;
import com.example.demo.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface IAnimalRegistrationService extends JpaRepository<Animal, Integer> {
    List<Animal> findByDate(LocalDate date);
    List<Animal> findByOrigin(String origin);
    @Query(value = "SELECT a.id, a.weight, a.origin, a.date, a.type FROM product INNER JOIN slaughter_house.product_part pp on product.id = pp.product_id inner join slaughter_house.animal_part ap on ap.id = pp.animal_part_id INNER JOIN slaughter_house.animal a on a.id = ap.animal_id WHERE product_id = ?", nativeQuery = true)
    List<Animal> findByProductId(int productId);
    @Query(
        value = "SELECT p.id FROM animal INNER JOIN slaughter_house.animal_part ap on animal.id = ap.animal_id "
            + "inner join slaughter_house.product_part pp on ap.id = pp.animal_part_id "
            + "inner join slaughter_house.product p on p.id = pp.product_id "
            + "WHERE animal.id = ?", nativeQuery = true) List<Product> findProductByAnimalId(int animalId);
}
