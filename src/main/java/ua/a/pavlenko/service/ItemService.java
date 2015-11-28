package ua.a.pavlenko.service;

import ua.a.pavlenko.entity.Item;

import java.util.List;

public interface ItemService {
    Item findOne(long itemId);
    List<Item> findAll();
    Item findByName(String name);
    void delete(long itemId);
    void deleteAll();
    //Item editItem();
    Item addOrEditItem(Item item);
}
