package com.petrol.service;

import com.petrol.entity.Petrol;
import com.petrol.repository.PetrolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class PetrolService {

    @Autowired
    private PetrolRepository repository;

    public Petrol fill(int quantity) {

        int price = quantity * 98;

        String dateTime = new SimpleDateFormat("yyyy.MM.dd HH:mm")
                .format(new Date());

        int date = Integer.parseInt(new SimpleDateFormat("dd")
                .format(new Date()));

        Petrol petrol = new Petrol();
        petrol.setDate(date);
        petrol.setPrice(price);
        petrol.setQuantity(quantity);
        petrol.setDateTime(dateTime);

        return repository.save(petrol);
    }

    public List<Petrol> getAll() {
        return repository.findAll();
    }

    public Integer totalSales() {
        return repository.getTotalSales();
    }

    public Integer salesByDate(int date) {
        return repository.getSalesByDate(date);
    }
}
