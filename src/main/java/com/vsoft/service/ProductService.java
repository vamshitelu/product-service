package com.vsoft.service;

import com.vsoft.entity.ProductEntity;
import com.vsoft.model.Product;
import com.vsoft.repository.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class ProductService {

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private ProductRepository productRepository;

    public Product getProduct(int id){
        ProductEntity entity = productRepository.findById(id).get();

        Product resp = modelMapper.map(entity, Product.class);

        return resp;
    }

    public Product addProduct(Product product){

        ProductEntity entity = modelMapper.map(product, ProductEntity.class);

        ProductEntity respEntity = productRepository.save(entity);

        return modelMapper.map(respEntity, Product.class);
    }

    public List<Product> getAllProducts(){

        List<Product> productList = new ArrayList<>();
       Iterator<ProductEntity> products = productRepository.findAll().iterator();
       while(products.hasNext()){
            Product product = modelMapper.map(products.next(), Product.class);
           productList.add(product);
       }
       return productList;
    }

}
