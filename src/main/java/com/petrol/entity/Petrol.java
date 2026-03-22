package com.petrol.entity;

import jakarta.persistence.*;

@Entity
public class Petrol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int date;
    private int price;
    private int quantity;
    private String dateTime;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public int getDate() { return date; }
    public void setDate(int date) { this.date = date; }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public String getDateTime() { return dateTime; }
    public void setDateTime(String dateTime) { this.dateTime = dateTime; }
}
