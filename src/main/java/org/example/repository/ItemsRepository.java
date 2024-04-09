package org.example.repository;

import org.example.entity.ItemsEntity;
import org.example.entity.OrdersEntity;
import org.springframework.data.repository.CrudRepository;

public interface ItemsRepository extends CrudRepository<ItemsEntity,String> {
}
