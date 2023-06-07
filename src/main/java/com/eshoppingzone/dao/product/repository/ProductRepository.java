

package com.eshoppingzone.dao.product.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eshoppingzone.entity.product.entity.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
 
    // Product findByProductName(String productName);
    
    List<Product>findByCategory(String category);

    List<Product> findByProductType(String productType);
}
