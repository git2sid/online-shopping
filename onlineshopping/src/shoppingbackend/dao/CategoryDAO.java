package shoppingbackend.dao;
import java.util.List;

import org.springframework.stereotype.Component;

import shoppingbackend.dto.Category;
@Component("categorydao")
public interface CategoryDAO {

	
	List<Category> list();

 Category getId(int id);
 boolean addCategory(Category category);
 boolean updateCategory(Category category);
 boolean deleteCategory(Category category);
}
