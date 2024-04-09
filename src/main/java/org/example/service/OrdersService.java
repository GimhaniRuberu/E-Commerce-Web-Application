package org.example.service;


import org.example.dto.Orders;
import org.example.entity.OrdersEntity;

import java.util.List;

public interface OrdersService {
        void addOrders(Orders order);

        List<OrdersEntity> getOrders();

        boolean deleteOrders(String id);

        Orders getOrdersById(String id);

}
