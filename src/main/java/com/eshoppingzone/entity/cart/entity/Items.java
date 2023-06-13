
	// package com.eshoppingzone.entity.cart.entity;
	// import java.util.Objects;

	// import jakarta.persistence.Entity;
	// import jakarta.persistence.Id;
	// import jakarta.persistence.JoinColumn;
	// import jakarta.persistence.ManyToOne;
	// import jakarta.persistence.Table;

	// @Entity
	// @Table(name="items")
	// public class Items {
	// 	@Id
	// 	private String productName;
	// 	private double price;
	// 	private int quantity;
		
	// 	@ManyToOne
	// 	@JoinColumn(name="user_cartId")
	// 	private Cart cart;
		
	// 	@Override
	// 	public String toString() {
	// 		return "Items [productName=" + productName + ", price=" + price + ", quantity=" + quantity + "]";
	// 	}

	// 	public Items(String productName, double price, int quantity) {
	// 		super();
	// 		this.productName = productName;
	// 		this.price = price;
	// 		this.quantity = quantity;
	// 	}

	// 	public Items() {
	// 		super();
			
	// 	}

	// 	public String getProductName() {
	// 		return productName;
	// 	}

	// 	public void setProductName(String productName) {
	// 		this.productName = productName;
	// 	}

	// 	public double getPrice() {
	// 		return price;
	// 	}

	// 	public void setPrice(double price) {
	// 		this.price = price;
	// 	}

	// 	public int getQuantity() {
	// 		return quantity;
	// 	}

	// 	public void setQuantity(int quantity) {
	// 		this.quantity = quantity;
	// 	}

	// 	@Override
	// 	public int hashCode() {
	// 		return Objects.hash(cart, price, productName, quantity);
	// 	}

	// 	@Override
	// 	public boolean equals(Object obj) {
	// 		if (this == obj)
	// 			return true;
	// 		if (obj == null)
	// 			return false;
	// 		if (getClass() != obj.getClass())
	// 			return false;
	// 		Items other = (Items) obj;
	// 		return Objects.equals(cart, other.cart)
	// 				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
	// 				&& Objects.equals(productName, other.productName) && quantity == other.quantity;
	// 	}
		
	// }



	// package com.eshoppingzone.entity.cart.entity;

	// import java.util.Objects;

	// import jakarta.persistence.Entity;
	// import jakarta.persistence.Id;
	// import jakarta.persistence.JoinColumn;
	// import jakarta.persistence.ManyToOne;
	// import jakarta.persistence.Table;

	// @Entity
	// @Table(name = "items")
	// public class Items {
	// 	@Id
	// 	private String productName;
	// 	private double price;
	// 	private int quantity;

	// 	@ManyToOne
	// 	@JoinColumn(name = "user_cartId")
	// 	private Cart cart;

	// 	// Constructor, getters, setters, hashCode, and equals methods

	// 	@Override
	// 	public String toString() {
	// 		return "Items [productName=" + productName + ", price=" + price + ", quantity=" + quantity + "]";
	// 	}

	// 	public Items(String productName, double price, int quantity) {
	// 		super();
	// 		this.productName = productName;
	// 		this.price = price;
	// 		this.quantity = quantity;
	// 	}

	// 	public Items() {
	// 		super();
	// 	}

	// 	public String getProductName() {
	// 		return productName;
	// 	}

	// 	public void setProductName(String productName) {
	// 		this.productName = productName;
	// 	}

	// 	public double getPrice() {
	// 		return price;
	// 	}

	// 	public void setPrice(double price) {
	// 		this.price = price;
	// 	}

	// 	public int getQuantity() {
	// 		return quantity;
	// 	}

	// 	public void setQuantity(int quantity) {
	// 		this.quantity = quantity;
	// 	}

	// 	public Cart getCart() {
	// 		return cart;
	// 	}

	// 	public void setCart(Cart cart) {
	// 		this.cart = cart;
	// 	}

	// 	@Override
	// 	public int hashCode() {
	// 		return Objects.hash(cart, price, productName, quantity);
	// 	}

	// 	@Override
	// 	public boolean equals(Object obj) {
	// 		if (this == obj)
	// 			return true;
	// 		if (obj == null)
	// 			return false;
	// 		if (getClass() != obj.getClass())
	// 			return false;
	// 		Items other = (Items) obj;
	// 		return Objects.equals(cart, other.cart)
	// 				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
	// 				&& Objects.equals(productName, other.productName) && quantity == other.quantity;
	// 	}
	// }



	// package com.eshoppingzone.entity.cart.entity;

	// import java.util.Objects;

	// import jakarta.persistence.Entity;
	// import jakarta.persistence.Id;
	// import jakarta.persistence.JoinColumn;
	// import jakarta.persistence.ManyToOne;
	// import jakarta.persistence.Table;

	// @Entity
	// @Table(name = "items")
	// public class Items {
	// 	@Id
	// 	private String productName;
	// 	private double price;
	// 	private int quantity;

	// 	@ManyToOne
	// 	@JoinColumn(name = "user_cartId")
	// 	private Cart cart;

	// 	public Items() {
	// 	}

	// 	public Items(String productName, double price, int quantity) {
	// 		this.productName = productName;
	// 		this.price = price;
	// 		this.quantity = quantity;
	// 	}

	// 	public String getProductName() {
	// 		return productName;
	// 	}

	// 	public void setProductName(String productName) {
	// 		this.productName = productName;
	// 	}

	// 	public double getPrice() {
	// 		return price;
	// 	}

	// 	public void setPrice(double price) {
	// 		this.price = price;
	// 	}

	// 	public int getQuantity() {
	// 		return quantity;
	// 	}

	// 	public void setQuantity(int quantity) {
	// 		this.quantity = quantity;
	// 	}

	// 	public Cart getCart() {
	// 		return cart;
	// 	}

	// 	public void setCart(Cart cart) {
	// 		this.cart = cart;
	// 	}

	// 	@Override
	// 	public String toString() {
	// 		return "Items [productName=" + productName + ", price=" + price + ", quantity=" + quantity + "]";
	// 	}

	// 	@Override
	// 	public int hashCode() {
	// 		return Objects.hash(cart, price, productName, quantity);
	// 	}

	// 	@Override
	// 	public boolean equals(Object obj) {
	// 		if (this == obj)
	// 			return true;
	// 		if (obj == null)
	// 			return false;
	// 		if (getClass() != obj.getClass())
	// 			return false;
	// 		Items other = (Items) obj;
	// 		return Objects.equals(cart, other.cart)
	// 				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
	// 				&& Objects.equals(productName, other.productName) && quantity == other.quantity;
	// 	}
	// }
