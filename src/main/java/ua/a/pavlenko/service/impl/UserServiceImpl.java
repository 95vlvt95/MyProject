package ua.a.pavlenko.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.a.pavlenko.entity.User;
import ua.a.pavlenko.repository.UserRepository;
import ua.a.pavlenko.service.UserService;

import java.util.List;

@Service("userService")
@Repository
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    public User findOne(long userId) {
        return userRepository.findOne(userId);
    }

    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }

    public User findByLoginName(String loginName) {
        return userRepository.findByLoginName(loginName);
    }

    public void delete(long userId) {
        userRepository.delete(userId);
    }

    public void deleteAll() {
        userRepository.deleteAll();
    }

    public User addOrEditUser(User user) {
        return userRepository.save(user);
    }
}
