package com.shy.service;

import com.shy.bean.Cart;

public interface OrderService {
    public String createOrder(Cart cart,Integer userId);
}
