package ua.a.pavlenko.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.a.pavlenko.entity.Item;
import ua.a.pavlenko.repository.ItemRepository;
import ua.a.pavlenko.service.ItemService;

import java.util.List;

@Service("itemService")
@Repository
@Transactional
public class ItemServiceImpl implements ItemService {
    @Autowired
    ItemRepository itemRepository;

    public Item findOne(long itemId) {
        return itemRepository.findOne(itemId);
    }

    public List<Item> findAll() {
        return (List<Item>) itemRepository.findAll();
    }

    public Item findByName(String name) {
        return itemRepository.findByName(name);
    }

    public void delete(long itemId) {
        itemRepository.delete(itemId);
    }

    public void deleteAll() {
        itemRepository.deleteAll();
    }

    public Item addOrEditItem(Item item) {
        return itemRepository.save(item);
    }
}
