package org.example.service.impl;

import org.example.dto.Items;
import org.example.entity.ItemsEntity;
import org.example.repository.ItemsRepository;
import org.example.service.ItemsService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemsServiceImpl implements ItemsService {
@Autowired
ItemsRepository repository;

    ModelMapper mapper;

    public void setup(){
        this.mapper=new ModelMapper();
    }
    @Override
    public void addItems(Items items) {
        ItemsEntity entity=mapper.map(items, ItemsEntity.class);
        repository.save(entity);
    }

    public List<ItemsEntity> getItems() {
       return (List<ItemsEntity>) repository.findAll();
    }

    @Override
    public boolean deleteItems(String id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Items getItemsById(String id) {
        Optional<ItemsEntity> byId = repository.findById(id);
        return mapper.map(byId,Items.class) ;
    }

}
