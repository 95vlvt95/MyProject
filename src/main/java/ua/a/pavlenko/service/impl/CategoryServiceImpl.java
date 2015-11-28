package ua.a.pavlenko.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.a.pavlenko.entity.Category;
import ua.a.pavlenko.repository.CategoryRepository;
import ua.a.pavlenko.service.CategoryService;

import java.util.List;

@Service("categoryService")
@Repository
@Transactional
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public Category findOne(long categoryId) {
        return categoryRepository.findOne(categoryId);
    }

    public List<Category> findAll() {
        return (List<Category>) categoryRepository.findAll();
    }

    public Category findByName(String name) {
        return categoryRepository.findByName(name);
    }

    public void delete(long id) {
        categoryRepository.delete(id);
    }

    public void deleteAll() {
        categoryRepository.deleteAll();
    }

    public Category addCategory(Category category) {
        Category addedCategory = categoryRepository.save(category);
        return addedCategory;
    }

    public Category editCategory(String name, String nameToEdit) {
        Category categoryToEdit = categoryRepository.findByName(name);
        categoryToEdit.setName(nameToEdit);
        return categoryRepository.save(categoryToEdit);
    }
}
