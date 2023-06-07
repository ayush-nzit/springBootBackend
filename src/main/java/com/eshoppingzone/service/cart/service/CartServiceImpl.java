
package com.eshoppingzone.service.cart.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.eshoppingzone.dao.cart.repository.CartRepository;
import com.eshoppingzone.entity.cart.entity.Cart;

@Service
public class CartServiceImpl implements CartService {

	private CartRepository cartRepository;

	public CartServiceImpl(CartRepository cartRepository) {
		this.cartRepository = cartRepository;
	}

	@Override
	public Optional<Cart> getcartByid(int productId) {
		return cartRepository.findById(productId);
	}

	@Override
	public Cart updateCart(Cart cart) {
		return cartRepository.save(cart);
	}

	@Override
	public List<Cart> getallcarts() {
		return cartRepository.findAll();
	}

	@Override
	public void clearCart() {
		cartRepository.deleteAll();
	}

	
	
	@Override
	public Cart deleteCart(int cartId) {
		cartRepository.deleteById(cartId);
		return null;
	}
	
	@Override
	public Cart addCart(Cart cart) {
		return cartRepository.save(cart);
	}

	@Override
	public double cartTotal(Cart cart) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'cartTotal'");
	}
}
