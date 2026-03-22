package com.petrol.controller;

import com.petrol.entity.Petrol;
import com.petrol.service.PetrolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/petrol")
public class PetrolController {

    @Autowired
    private PetrolService service;

    @PostMapping("/fill")
    public Petrol fill(@RequestParam int quantity) {
        return service.fill(quantity);
    }

    @GetMapping("/sales/total")
    public Integer totalSales() {
        return service.totalSales();
    }

    @GetMapping("/sales/{date}")
    public Integer salesByDate(@PathVariable int date) {
        return service.salesByDate(date);
    }

    @GetMapping("/report")
    public List<Petrol> report() {
        return service.getAll();
    }
}
