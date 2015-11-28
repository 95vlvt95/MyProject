package ua.a.pavlenko.service;

import ua.a.pavlenko.entity.User;

import java.util.List;

public interface
        UserService {
        User findOne(long userId);
        List<User> findAll();
        User findByLoginName(String loginName);
        void delete(long userId);
        void deleteAll();
        User addOrEditUser(User user);
}
