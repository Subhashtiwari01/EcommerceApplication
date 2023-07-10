package com.project.EcommerceApi.Controller;

import com.project.EcommerceApi.Model.Order;
import com.project.EcommerceApi.Service.OrderService;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping("order")

    public Iterable<Order> getOrder(){
        return orderService.getOrder();
    }
    @GetMapping("order/{orderId}")

    public Optional<Order> getOrderByOrderId(@PathVariable Long orderId){
        return orderService.getOrderByOrderId(orderId);
    }


    @PostMapping("order")

    public String createOrderByUserId(@RequestBody Order order){
        return orderService.createOrderByUserId(order);
    }

}
