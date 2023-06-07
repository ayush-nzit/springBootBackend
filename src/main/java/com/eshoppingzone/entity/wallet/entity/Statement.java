package com.eshoppingzone.entity.wallet.entity;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Entity
public class Statement {
	
	 
	@ManyToOne
	private Ewallet ewallet;
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer statementId;
	private String transactionType;
	private double amount;
	private LocalDateTime dateTime;
	private Integer orderId;
	private String transactionRemarks;
	
	
	public Statement() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Statement(Integer statementId, String transactionType, double amount, LocalDateTime dateTime,
			Integer orderId, String transactionRemarks) {
		super();
		this.statementId = statementId;
		this.transactionType = transactionType;
		this.amount = amount;
		this.dateTime = dateTime;
		this.orderId = orderId;
		this.transactionRemarks = transactionRemarks;
	}

	public Integer getStatementId() {
		return statementId;
	}
	public void setStatementId(Integer statementId) {
		this.statementId = statementId;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getTransactionRemarks() {
		return transactionRemarks;
	}
	public void setTransactionRemarks(String transactionRemarks) {
		this.transactionRemarks = transactionRemarks;
	}

	@Override
	public String toString() {
		return "Statement [statementId=" + statementId + ", transactionType=" + transactionType + ", amount=" + amount
				+ ", dateTime=" + dateTime + ", orderId=" + orderId + ", transactionRemarks=" + transactionRemarks
				+ "]";
	}
	

}
