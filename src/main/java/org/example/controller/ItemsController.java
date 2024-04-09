package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.Items;
import org.example.entity.ItemsEntity;
import org.example.service.ItemsService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/items")
@RequiredArgsConstructor
@CrossOrigin
public class ItemsController {
    final ItemsService service;

    @PostMapping("/addItems")
    @ResponseStatus(HttpStatus.CREATED)
    public void addItems(@RequestBody Items items){
    service.addItems(items);
}

    @GetMapping("/getItems")
    public Iterable<ItemsEntity> getItems(){
        return service.getItems();
    }

    @DeleteMapping("/{itemsId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String deleteItems(@PathVariable String id){
        if (service.deleteItems(id)){
            return "Deleted";
        }else{
            return "Not Deleted";
        }
    }


    @GetMapping("search/{id}")
    public Items getItemsId(@PathVariable String id){
        return service.getItemsById(id);
    }
}
