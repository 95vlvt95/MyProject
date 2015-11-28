import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import ua.a.pavlenko.entity.Item;
import ua.a.pavlenko.service.CategoryService;
import ua.a.pavlenko.service.ItemService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring-config.xml"})
@Transactional
@TransactionConfiguration(defaultRollback = false)
public class ItemServiceTest {

    @Autowired
    ItemService itemService;

    @Autowired
    CategoryService categoryService;

    @Test
    public void addOrEditItem(){
        itemService.addOrEditItem(new Item(categoryService.findOne(27), "first_item", 100.1 ));
    }
}
