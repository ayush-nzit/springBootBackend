package com.eshoppingzone.entity.wallet.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "ewallet")
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor


public class Ewallet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer walletId;
	private double currentBalance;
	private Integer profileId;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "wallet_id")
	private List<Statement> statement;

}
