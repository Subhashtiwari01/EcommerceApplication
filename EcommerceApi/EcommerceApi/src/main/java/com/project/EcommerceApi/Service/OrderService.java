package com.project.EcommerceApi.Service;

import com.project.EcommerceApi.Model.Order;
import com.project.EcommerceApi.Repository.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    IOrderRepo orderRepo;
    public String createOrderByUserId(Order order) {
        orderRepo.save(order);
        return "Order Created";
    }

    public Iterable<Order> getOrder() {
        return orderRepo.findAll();
    }

    public Optional<Order> getOrderByOrderId(Long orderId) {
        return orderRepo.findById(orderId);
    }
}
