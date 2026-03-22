package com.petrol.repository;

import com.petrol.entity.Petrol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PetrolRepository extends JpaRepository<Petrol, Long> {

    @Query("SELECT SUM(p.price) FROM Petrol p")
    Integer getTotalSales();

    @Query("SELECT SUM(p.price) FROM Petrol p WHERE p.date = :date")
    Integer getSalesByDate(int date);
}
