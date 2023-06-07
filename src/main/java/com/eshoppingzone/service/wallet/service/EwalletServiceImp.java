package com.eshoppingzone.service.wallet.service;

import java.util.List;

import com.eshoppingzone.dao.wallet.repository.EwalletRepository;
import com.eshoppingzone.dao.wallet.repository.StatementRepository;

import com.eshoppingzone.entity.wallet.entity.Ewallet;
import com.eshoppingzone.entity.wallet.entity.Statement;



public class EwalletServiceImp implements EwalletService{
	
private EwalletRepository ewalletrepository;
private StatementRepository statementrepository;

@Override


public List<Ewallet> getWallets() {
	// TODO Auto-generated method stub
	return null;
}
@Override
public Ewallet addWallets() {
	// TODO Auto-generated method stub
	return null;
}
@Override
public void addMoney(Ewallet ewallet, double amount, String transactionRemark) {
	// TODO Auto-generated method stub
	
}
@Override
public void update(Ewallet ewallet, double amount, String transactionType, int orderId) {
	// TODO Auto-generated method stub
	
}
@Override
public Ewallet getById(int orderId) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public List<Statement> getStatementById(int orderId) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public List<Statement> getStatement() {
	// TODO Auto-generated method stub
	return null;
}
@Override
public void deleteById(int orderId) {
	// TODO Auto-generated method stub
	
}

	

}
