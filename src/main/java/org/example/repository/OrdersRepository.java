package org.example.repository;

import org.example.entity.OrdersEntity;
import org.springframework.data.repository.CrudRepository;

public interface OrdersRepository extends CrudRepository<OrdersEntity,String> {
}
