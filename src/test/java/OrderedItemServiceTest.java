import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import ua.a.pavlenko.entity.OrderedItem;
import ua.a.pavlenko.service.ItemService;
import ua.a.pavlenko.service.OrderedItemService;
import ua.a.pavlenko.service.UserOrderService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring-config.xml"})
@Transactional
@TransactionConfiguration(defaultRollback = false)
public class OrderedItemServiceTest {

    @Autowired
    OrderedItemService orderedItemService;

    @Autowired
    ItemService itemService;

    @Autowired
    UserOrderService userOrderService;

    @Test
    public void addOrEditOrderedItemTest(){
        orderedItemService.addOrEditOrderedItem(new OrderedItem(itemService.findOne(5),
                userOrderService.findOne(1), 10, 10.1));
    }
}
