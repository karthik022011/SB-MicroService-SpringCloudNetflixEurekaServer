package com.microservice.orderservice.service;


import com.kartheek.orderservice.model.OrderReqDtO;

public interface OrderService {
    long placeOrder(OrderReqDtO orderReqDtO);
}
