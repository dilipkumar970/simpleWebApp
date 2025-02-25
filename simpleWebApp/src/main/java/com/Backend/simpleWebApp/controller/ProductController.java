package com.Backend.simpleWebApp.controller;


import com.Backend.simpleWebApp.model.Product;
import com.Backend.simpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //Responsible for handling the httprequests from the client and Redirects to different url based on the requirement
@RequestMapping("/api")

public class ProductController {

    // It automatically calls the bean and links the service page into the controller paga
    @Autowired
    private ProductService service; // Created productService obj with reference variable service

    @RequestMapping("/")
    public String greet(){
        return "Welcome To Backend development ";
    }

    @GetMapping("/products")
    // used to list all products present in the database with the help of service reference obj
    public List<Product> getAllProducts(){
        return service.getAllProducts();
    }


}
