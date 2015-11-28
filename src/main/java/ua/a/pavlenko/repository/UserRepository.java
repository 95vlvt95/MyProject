package ua.a.pavlenko.repository;

import org.springframework.data.repository.CrudRepository;
import ua.a.pavlenko.entity.User;

public interface UserRepository extends CrudRepository<User, Long>{
    User findByLoginName(String loginName);
}
