


package com.eshoppingzone.entity.cart.entity;


import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_cart")
public class Cart {
	@Id
	private int productId;
	private String productName;
	private List<String> image;
	private double price;
	private int quantity;
	private String category;
	// @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL)
	// private List<Items> items;

}
