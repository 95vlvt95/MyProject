package ua.a.pavlenko.service;

import ua.a.pavlenko.entity.Category;

import java.util.List;

public interface CategoryService {
    Category findOne(long categoryId);
    List<Category> findAll();
    Category findByName(String name);
    void delete(long id);
    void deleteAll();
    Category addCategory(Category category);
    Category editCategory(String name, String nameToEdit);
}
