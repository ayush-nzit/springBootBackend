package com.eshoppingzone.dao.order.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eshoppingzone.entity.cart.entity.Cart;
import com.eshoppingzone.entity.order.Orders;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Integer> {

    List<Orders> findByCustomerId(Long customerId);

    List<Orders> findByCustomerIdOrderByOrderDateDesc(Long customerId);



    List<Orders> findAllByOrderByOrderDateDesc();
    
}
