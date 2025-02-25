package com.Backend.simpleWebApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity // Making as an entity to store in the database automatcially instead of creating everything from database it Repository  layer
@Data
// Data , argsconstructor are created by the lombok dependency to auto generate the constructor presents in this page
@AllArgsConstructor
@NoArgsConstructor

public class Product {

    @Id
    // It is used to auto generate the ID in database
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String desc;
    private String brand;
    private BigDecimal price;
    private String category;
    private int quantity;
    private boolean available;
    private Date releaseDate;
}
