package com.Backend.simpleWebApp.service;

import com.Backend.simpleWebApp.model.Product;
import com.Backend.simpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service


public class ProductService {

    @Autowired
    private ProductRepo repo; //importing Repository layer with reference variable repo which retrives the date from the repository

    public List<Product> getAllProducts() {

        return repo.findAll();  // To return all products presented or added in the database

    }
}
