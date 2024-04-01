package com.vsoft.controller;

import com.vsoft.model.Product;
import com.vsoft.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable int id){
        return productService.getProduct(id);
    }

    @GetMapping
    public List<Product> getProducts(){
        return productService.getAllProducts();
    }

}
