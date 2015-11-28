package ua.a.pavlenko.repository;

import org.springframework.data.repository.CrudRepository;
import ua.a.pavlenko.entity.Item;

import java.util.List;

public interface ItemRepository extends CrudRepository<Item, Long>{
    Item findByName(String name);
    List<Item> findByNameContaining(String name);
    List<Item> findByNameContainingAndPriceBetween(String name, double lowPrice, double highPrice);
    List<Item> findByPriceBetween(double lowPrice, double highPrice);
}
