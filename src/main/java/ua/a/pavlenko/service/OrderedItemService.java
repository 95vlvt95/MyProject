package ua.a.pavlenko.service;

import ua.a.pavlenko.entity.Item;
import ua.a.pavlenko.entity.OrderedItem;
import ua.a.pavlenko.entity.UserOrder;

import java.util.List;

public interface OrderedItemService {
    OrderedItem findOne(long orderedItemId);
    List<OrderedItem> findAll();
    List<OrderedItem> findByUserOrderId(UserOrder userOrder);
    List<OrderedItem> findByItemId(Item item);
    void delete(long oredereItemId);
    void deleteAll();
    OrderedItem addOrEditOrderedItem(OrderedItem orderedItem);
}
