package com.eshoppingzone.entity.wallet.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Ewallet {
	@Id
	private Integer walletId;
	private double currentBalancel;
	@OneToMany(mappedBy="ewallet")
	private List<Statement> statement;
	
	public Ewallet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ewallet(Integer walletId, double currentBalancel) {
		super();
		this.walletId = walletId;
		this.currentBalancel = currentBalancel;
	}
	public Integer getWalletId() {
		return walletId;
	}
	public void setWalletId(Integer walletId) {
		this.walletId = walletId;
	}
	public double getCurrentBalancel() {
		return currentBalancel;
	}
	public void setCurrentBalancel(double currentBalancel) {
		this.currentBalancel = currentBalancel;
	}
	@Override
	public String toString() {
		return "Ewallet [walletId=" + walletId + ", currentBalancel=" + currentBalancel + "]";
	}

}
