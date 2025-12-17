package com.example.fundamentalsapi.service;

import com.example.fundamentalsapi.model.request.CreateOrderRequest;
import com.example.fundamentalsapi.model.response.OrderResponse;

public interface OrderService {

    OrderResponse createOrder(CreateOrderRequest request);

    OrderResponse getOrderById(String id);
}

