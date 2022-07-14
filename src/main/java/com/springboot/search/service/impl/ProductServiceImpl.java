package com.springboot.search.service.impl;

import com.springboot.search.entity.Product;
import com.springboot.search.repository.ProductRepository;
import com.springboot.search.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> searchProductsJPQL(String query) {
        List<Product> products = productRepository.searchProductsJPQL(query);
        return products;    }

    @Override
    public List<Product> searchProductsSQL(String query) {
        List<Product> products = productRepository.searchProductsSQL(query);
        return products;
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

}
