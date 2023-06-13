package com.eshoppingzone.entity.wallet.entity;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "statement")
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Statement {
	
	 
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer statementId;
	private String transactionType;
	private double amount;
	private LocalDateTime dateTime;
	private Integer orderId;
	private String transactionRemarks;
	


}
