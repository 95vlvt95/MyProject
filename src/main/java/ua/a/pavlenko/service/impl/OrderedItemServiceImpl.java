package ua.a.pavlenko.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.a.pavlenko.entity.Item;
import ua.a.pavlenko.entity.OrderedItem;
import ua.a.pavlenko.entity.UserOrder;
import ua.a.pavlenko.repository.OrderedItemRepository;
import ua.a.pavlenko.service.OrderedItemService;

import java.util.List;

@Service("orderedItemService")
@Repository
@Transactional
public class OrderedItemServiceImpl implements OrderedItemService {

    @Autowired
    OrderedItemRepository orderedItemRepository;

    public OrderedItem findOne(long orderedItemId) {
        return orderedItemRepository.findOne(orderedItemId);
    }

    public List<OrderedItem> findAll() {
        return (List<OrderedItem>) orderedItemRepository.findAll();
    }

    public List<OrderedItem> findByUserOrderId(UserOrder userOrder) {
        return orderedItemRepository.findByUserOrderId(userOrder);
    }

    public List<OrderedItem> findByItemId(Item item) {
        return orderedItemRepository.findByItemId(item);
    }

    public void delete(long oredereItemId) {
        orderedItemRepository.delete(oredereItemId);
    }

    public void deleteAll() {
        orderedItemRepository.deleteAll();
    }

    public OrderedItem addOrEditOrderedItem(OrderedItem orderedItem) {
        return orderedItemRepository.save(orderedItem);
    }
}
