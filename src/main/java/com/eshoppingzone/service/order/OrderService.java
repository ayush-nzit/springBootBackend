package com.eshoppingzone.service.order;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.eshoppingzone.entity.cart.entity.Cart;
import com.eshoppingzone.entity.order.ShippingAddress;
import com.eshoppingzone.entity.order.Orders;
@Service
public interface OrderService {
    
    List<Orders> getAllOrders();

    Orders placeOrder(Orders Order);

    String changeStatus(String orderStatus, int orderId);

    List<Orders> getAddressByCustomerId(int customerId);

    List <ShippingAddress> getAllAddres();

    // Orders getOrderById();
    Optional<Orders> getOrderById(int orderId);

    List<Orders> findByCustomerId(Long customerId);
}


