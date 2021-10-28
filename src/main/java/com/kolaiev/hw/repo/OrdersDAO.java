package com.kolaiev.hw.repo;

import com.kolaiev.hw.model.Orders;

import java.util.List;

public interface OrdersDAO {
    List<Orders> getAllOrders();
}
