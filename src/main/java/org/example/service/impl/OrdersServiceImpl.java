package org.example.service.impl;

import org.example.dto.Orders;
import org.example.entity.OrdersEntity;
import org.example.repository.OrdersRepository;
import org.example.service.OrdersService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrdersServiceImpl implements OrdersService {
@Autowired
OrdersRepository repository;

    ModelMapper mapper;

    public void setup(){
        this.mapper=new ModelMapper();
    }
    @Override
    public void addOrders(Orders orders) {
        OrdersEntity entity=mapper.map(orders, OrdersEntity.class);
        repository.save(entity);
    }

    public List<OrdersEntity> getOrders() {
       return (List<OrdersEntity>) repository.findAll();
    }

    @Override
    public boolean deleteOrders(String id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Orders getOrdersById(String id) {
        Optional<OrdersEntity> byId = repository.findById(id);
        return mapper.map(byId,Orders.class) ;
    }

}
