
package com.eshoppingzone.dao.cart.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eshoppingzone.entity.cart.entity.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer>{
 
	// Cart findByproductId(int productId);
}
