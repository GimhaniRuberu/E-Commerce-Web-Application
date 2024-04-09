package org.example.service;

import org.example.dto.Items;
import org.example.entity.ItemsEntity;
import java.util.List;

public interface ItemsService {
        void addItems(Items items);

        List<ItemsEntity> getItems();

        boolean deleteItems(String id);

        Items getItemsById(String id);

}
