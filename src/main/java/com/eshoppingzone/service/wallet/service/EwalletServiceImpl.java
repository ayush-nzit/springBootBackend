// package com.eshoppingzone.service.wallet.service;

// import java.util.List;

// import com.eshoppingzone.dao.wallet.repository.EwalletRepository;
// import com.eshoppingzone.dao.wallet.repository.StatementRepository;

// import com.eshoppingzone.entity.wallet.entity.Ewallet;
// import com.eshoppingzone.entity.wallet.entity.Statement;

// public class EwalletServiceImp implements EwalletService{

// private EwalletRepository ewalletrepository;
// private StatementRepository statementrepository;

// @Override

// public List<Ewallet> getWallets() {
// 	// TODO Auto-generated method stub
// 	return null;
// }
// @Override
// public Ewallet addWallets() {
// 	// TODO Auto-generated method stub
// 	return null;
// }
// @Override
// public void addMoney(Ewallet ewallet, double amount, String transactionRemark) {
// 	// TODO Auto-generated method stub

// }
// @Override
// public void update(Ewallet ewallet, double amount, String transactionType, int orderId) {
// 	// TODO Auto-generated method stub

// }
// @Override
// public Ewallet getById(int orderId) {
// 	// TODO Auto-generated method stub
// 	return null;
// }
// @Override
// public List<Statement> getStatementById(int orderId) {
// 	// TODO Auto-generated method stub
// 	return null;
// }
// @Override
// public List<Statement> getStatement() {
// 	// TODO Auto-generated method stub
// 	return null;
// }
// @Override
// public void deleteById(int orderId) {
// 	// TODO Auto-generated method stub

// }

// }


package com.eshoppingzone.service.wallet.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eshoppingzone.dao.wallet.repository.EwalletRepository;
import com.eshoppingzone.dao.wallet.repository.StatementRepository;

import com.eshoppingzone.entity.wallet.entity.Ewallet;
import com.eshoppingzone.entity.wallet.entity.Statement;





@Service
public class EwalletServiceImpl implements EwalletService {

	private final EwalletRepository ewalletRepository;

	@Autowired
	public EwalletServiceImpl(EwalletRepository ewalletRepository) {
		this.ewalletRepository = ewalletRepository;
	}

	@Override
	public List<Ewallet> getWallets() {
		return ewalletRepository.findAll();
	}

	@Override
	public Ewallet addWallets( Ewallet ewallet ) {
		return ewalletRepository.save(ewallet);
	}

	@Override
	public void addMoney(int walletId, double amount) {
		Optional<Ewallet> optionalEwallet = ewalletRepository.findById(walletId);
		if (optionalEwallet.isPresent()) {
			Ewallet ewallet = optionalEwallet.get();
			double currentBalance = ewallet.getCurrentBalance();
			ewallet.setCurrentBalance(currentBalance + amount);
			ewalletRepository.save(ewallet);
		}
	}

	@Override
	public Ewallet getById(int walletId) {
		return ewalletRepository.findById(walletId).orElse(null);
	}

	@Override
	public Ewallet getByProfileId(int profileId) {
		return ewalletRepository.findByProfileId(profileId);
	}

	@Override
	public List<Statement> getStatementById(int walletId) {
		Optional<Ewallet> optionalEwallet = ewalletRepository.findById(walletId);
		if (optionalEwallet.isPresent()) {
			Ewallet ewallet = optionalEwallet.get();
			return ewallet.getStatement();
		}
		return null;
	}

	

}
