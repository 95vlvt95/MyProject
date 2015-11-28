package ua.a.pavlenko.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.a.pavlenko.entity.User;
import ua.a.pavlenko.entity.UserOrder;
import ua.a.pavlenko.repository.UserOrderRepository;
import ua.a.pavlenko.service.UserOrderService;

import java.util.Calendar;
import java.util.List;

@Service("userOrderService")
@Repository
@Transactional
public class UserOrderServiceImpl implements UserOrderService {

    @Autowired(required = true)
    UserOrderRepository userOrderRepository;

    public UserOrder findOne(long userOrderId) {
        return userOrderRepository.findOne(userOrderId);
    }

    public List<UserOrder> findAll() {
        return (List<UserOrder>) userOrderRepository.findAll();
    }

    public List<UserOrder> findByUserId(User user) {
        return userOrderRepository.findByUserId(user);
    }

    public List<UserOrder> findByDate(Calendar date) {
        return userOrderRepository.findByDate(date);
    }

    public void delete(long userOrderId) {
        userOrderRepository.delete(userOrderId);
    }

    public void deleteAll() {
        userOrderRepository.deleteAll();
    }

    public UserOrder addOrEditUserOrder(UserOrder userOrder) {
        return userOrderRepository.save(userOrder);
    }
}
