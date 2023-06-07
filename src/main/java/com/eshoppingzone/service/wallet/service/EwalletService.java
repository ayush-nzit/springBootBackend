package com.eshoppingzone.service.wallet.service;

import java.util.List;
import com.eshoppingzone.entity.wallet.entity.Ewallet;
import com.eshoppingzone.entity.wallet.entity.Statement;


public interface EwalletService {
public List<Ewallet> getWallets();
public Ewallet addWallets();
public void addMoney(Ewallet ewallet,double amount,String transactionRemark);
public void update(Ewallet ewallet,double amount,String transactionType,int orderId);
public Ewallet getById(int orderId);
public List<Statement>getStatementById(int orderId);
public List<Statement>getStatement();
public void deleteById(int orderId);
}
