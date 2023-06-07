package com.eshoppingzone.service.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eshoppingzone.dao.product.repository.ProductRepository;
import com.eshoppingzone.entity.product.entity.Product;

@Service
public class ProductServicImpl implements ProductService {

    public ProductServicImpl() {
    }





    @Autowired
    private ProductRepository productRepository;


    @Override
    public Product addProudect(Product product) {
        return productRepository.save(product);
    }

  

   
    @Override
    public Product updateProducts(Product product) {
       return productRepository.save(product);
    }

    @Override
    public void deleteProductById(Long id) {
       productRepository.deleteById(id);
    }

    @Override
    public List<Product> getProductByCategory(String category) {
        return productRepository.findByCategory(category);  
    }

    @Override
    public List<Product> getProductByType(String type) {
        return productRepository.findByProductType(type);
    }

    @Override
    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }




    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

   
}
