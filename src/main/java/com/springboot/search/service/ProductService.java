package com.springboot.search.service;

import com.springboot.search.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> searchProductsJPQL(String query);

    List<Product> searchProductsSQL(String query);

    Product createProduct(Product product);
}
