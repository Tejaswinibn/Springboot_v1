package com.example.fundamentalsapi.service.impl;

import com.example.fundamentalsapi.exception.OrderNotFoundException;
import com.example.fundamentalsapi.model.request.CreateOrderRequest;
import com.example.fundamentalsapi.model.response.OrderResponse;
import com.example.fundamentalsapi.service.OrderService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.UUID;

@Service
public class DefaultOrderService implements OrderService {

    @Override
    public OrderResponse createOrder(CreateOrderRequest request) {
        OrderResponse response = new OrderResponse();
        response.setOrderId(UUID.randomUUID().toString());
        response.setCustomerId(request.getCustomerId());
        response.setAmount(request.getAmount());
        return response;
    }

    @Override
    public OrderResponse getOrderById(String id) {

        // temporary in-memory behavior
        if (id.equals("404")) {
            throw new OrderNotFoundException(id);
        }

        OrderResponse response = new OrderResponse();
        response.setOrderId(id);
        response.setCustomerId("C101");
        response.setAmount(new BigDecimal("150.00"));

        return response;
    }
}

