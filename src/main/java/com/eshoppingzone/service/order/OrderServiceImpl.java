package com.eshoppingzone.service.order;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eshoppingzone.dao.order.repository.OrderRepository;
import com.eshoppingzone.entity.cart.entity.Cart;
import com.eshoppingzone.entity.order.ShippingAddress;
import com.eshoppingzone.entity.order.Orders;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<Orders> getAllOrders() {
        // return orderRepository.findAll();
        return orderRepository.findAllByOrderByOrderDateDesc();
    }

    @Override
    public Orders placeOrder(Orders order) {
        
        return orderRepository.save(order);
        // Logic to convert cart to order and save it
    }

    @Override
    public String changeStatus(String orderStatus, int orderId) {
        Optional<Orders> optionalOrder = orderRepository.findById(orderId);
        if (optionalOrder.isPresent()) {
            Orders order = optionalOrder.get();
            order.setOrderStatus(orderStatus);
            orderRepository.save(order);
            return "Order status changed successfully.";
        }
        return "Order not found.";
    }

    @Override
    public List<Orders> getAddressByCustomerId(int customerId) {
        // Logic to get orders by customer ID
        return null;
    }

    @Override
    public List<ShippingAddress> getAllAddres() {
        // Logic to get all addresses
        return null;
    }

    @Override
    public Optional<Orders> getOrderById(int orderId) {
        return orderRepository.findById(orderId);
    }

    @Override
    public List<Orders> findByCustomerId(Long customerId) {
        // return orderRepository.findByCustomerId(customerId);
        // return orderRepository.findByCustomerIdOrderByOrderDateDesc(customerId);
        return orderRepository.findByCustomerIdOrderByOrderDateDesc(customerId);
    }


    // @Override
    // public List<Orders> getOrdersByCustomerId(Long customerId) {
    //     return orderRepository.findByCustomerId(customerId);
    // }
}
