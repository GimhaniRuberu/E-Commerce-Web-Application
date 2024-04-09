package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.Orders;
import org.example.entity.OrdersEntity;
import org.example.service.OrdersService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
@CrossOrigin
public class OrdersController {
    final OrdersService service;

    @PostMapping("/addOrders")
    @ResponseStatus(HttpStatus.CREATED)
    public void addOrders(@RequestBody Orders orders){
    service.addOrders(orders);
}

    @GetMapping("/getOrders")
    public Iterable<OrdersEntity> getUser(){
        return service.getOrders();
    }

    @DeleteMapping("/{ordersId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String deleteOrders(@PathVariable String id){
        if (service.deleteOrders(id)){
            return "Deleted";
        }else{
            return "Not Deleted";
        }
    }


    @GetMapping("search/{id}")
    public Orders getOrdersId(@PathVariable String id){
        return service.getOrdersById(id);
    }
}
