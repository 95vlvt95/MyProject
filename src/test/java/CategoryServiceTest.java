import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import ua.a.pavlenko.entity.Category;
import ua.a.pavlenko.service.CategoryService;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring-config.xml"})
@Transactional
@TransactionConfiguration(defaultRollback = true)
public class CategoryServiceTest {
    @Autowired
    CategoryService categoryService;


    //@Test
    @Ignore
    public void findOneTest(){
        Category foundCategory =  categoryService.findOne((long) 13);
        System.out.println(foundCategory.toString());
    }


    //@Test
    @Ignore
    public void findAllTest(){
        List<Category> allFoundCategory = categoryService.findAll();
        for(Category category : allFoundCategory){
            System.out.println(category.toString());
        }
    }


    @Test
    public void findByNameTest(){
        Category foundByNameCategory =  categoryService.findByName("edited_category_2");
        System.out.println(foundByNameCategory.toString());
    }

    //@Test
    public void deleteAllTest(){
        categoryService.deleteAll();
    }

    //@Test
    public void deleteOne(){
        categoryService.delete(28);
    }

    //@Test
    public void addCategoryTest(){
        categoryService.addCategory(new Category("new_category_test4"));
    }

    //@Test
    public void editCategoryTest(){
        categoryService.editCategory(categoryService.findOne(27).getName(), "edited_category_2");
    }
}
