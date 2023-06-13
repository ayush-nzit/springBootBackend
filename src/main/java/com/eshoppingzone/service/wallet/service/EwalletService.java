package com.eshoppingzone.service.wallet.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.eshoppingzone.entity.wallet.entity.Ewallet;
import com.eshoppingzone.entity.wallet.entity.Statement;

@Service
public interface EwalletService {
public List<Ewallet> getWallets();
public Ewallet addWallets(Ewallet ewallet);
public void addMoney(int walletId,double amount);

public Ewallet getById(int orderId);

public Ewallet getByProfileId(int profileId);
public List<Statement>getStatementById(int walletId);

}
