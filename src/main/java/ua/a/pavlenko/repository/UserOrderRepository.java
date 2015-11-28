package ua.a.pavlenko.repository;

import org.springframework.data.repository.CrudRepository;
import ua.a.pavlenko.entity.User;
import ua.a.pavlenko.entity.UserOrder;

import java.util.Calendar;
import java.util.List;


public interface UserOrderRepository extends CrudRepository<UserOrder, Long>{
    List<UserOrder> findByUserId(User user);
    List<UserOrder> findByDate(Calendar date);
}
