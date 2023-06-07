package com.eshoppingzone.service.product.service;

import java.util.List;
import java.util.Optional;

import com.eshoppingzone.entity.product.entity.Product;

public interface ProductService {
    
    Product addProudect(Product product);

    List<Product> getAllProducts();
    
    Optional<Product> getProductById(Long id);

    Product updateProducts(Product product);

    void deleteProductById(Long id);

    List<Product> getProductByCategory(String category);
     
    List<Product> getProductByType(String type);
}
