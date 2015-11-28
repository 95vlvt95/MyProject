import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import ua.a.pavlenko.entity.User;
import ua.a.pavlenko.service.UserService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring-config.xml"})
@Transactional
@TransactionConfiguration(defaultRollback = false)
public class UserServiceTest {

    @Autowired
    UserService userService;

    @Test
    public void addOrEditUser(){
        userService.addOrEditUser(new User("user1", "user1", "name", "lastname", "email"));
    }
}
