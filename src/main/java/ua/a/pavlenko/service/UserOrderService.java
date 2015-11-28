package ua.a.pavlenko.service;

import ua.a.pavlenko.entity.User;
import ua.a.pavlenko.entity.UserOrder;

import java.util.Calendar;
import java.util.List;

public interface UserOrderService {
    UserOrder findOne(long userOrderId);
    List<UserOrder> findAll();
    List<UserOrder> findByUserId(User user);
    List<UserOrder> findByDate(Calendar date);
    void delete(long userOrderId);
    void deleteAll();
    UserOrder addOrEditUserOrder(UserOrder userOrder);
}
