package ua.a.pavlenko.repository;

import org.springframework.data.repository.CrudRepository;
import ua.a.pavlenko.entity.Category;


public interface CategoryRepository extends CrudRepository<Category, Long> {
    Category findByName(String name);
}
