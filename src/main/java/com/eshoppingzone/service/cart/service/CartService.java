
package com.eshoppingzone.service.cart.service;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.eshoppingzone.entity.cart.entity.Cart;

@Service
public interface CartService {
   
	Optional<Cart> getcartByid(int productId);
	Cart updateCart (Cart cart);
	List<Cart> getallcarts();
	double cartTotal(Cart cart);

	Cart addCart(Cart cart);
	Cart deleteCart (int productId);
	
	void clearCart();
}
