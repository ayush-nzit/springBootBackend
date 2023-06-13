package com.eshoppingzone.dao.wallet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eshoppingzone.entity.wallet.entity.Ewallet;

@Repository
public interface EwalletRepository extends JpaRepository<Ewallet,Integer>{

    Ewallet findByProfileId(int profileId);

}
