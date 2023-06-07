package com.eshoppingzone.dao.wallet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eshoppingzone.entity.wallet.entity.Statement;


@Repository
public interface StatementRepository extends JpaRepository<Statement ,Integer>{

}
