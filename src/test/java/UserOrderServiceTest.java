import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import ua.a.pavlenko.entity.UserOrder;
import ua.a.pavlenko.service.UserOrderService;
import ua.a.pavlenko.service.UserService;

import java.util.Calendar;
import java.util.GregorianCalendar;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring-config.xml"})
@Transactional
@TransactionConfiguration(defaultRollback = false)
public class UserOrderServiceTest {

    @Autowired
    @Qualifier("userOrderService")
    UserOrderService userOrderService;

    @Autowired
    UserService userService;

    @Test
    public void addOrEditUserOrder(){
        userOrderService.addOrEditUserOrder(new UserOrder(userService.findOne(4), new GregorianCalendar(2015, Calendar.NOVEMBER, 28)));
    }
}
