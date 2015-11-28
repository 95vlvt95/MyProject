package ua.a.pavlenko.repository;

import org.springframework.data.repository.CrudRepository;
import ua.a.pavlenko.entity.Item;
import ua.a.pavlenko.entity.OrderedItem;
import ua.a.pavlenko.entity.UserOrder;

import java.util.List;

public interface OrderedItemRepository extends CrudRepository<OrderedItem, Long>{
    List<OrderedItem> findByUserOrderId(UserOrder userOrder);
    List<OrderedItem> findByItemId(Item item);
}
