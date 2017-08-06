package shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import shoppingbackend.dao.CategoryDAO;
import shoppingbackend.dto.Category;
@Component
@Repository("categoryDAO")
public class CategoryDAOimpl implements CategoryDAO{

	
	private static List<Category> categories= new ArrayList<>();
	static {
		Category category=new Category();
		category.setDescription("laptop is good");
		category.setId("1");
		category.setImageURL("img_1.png");
		category.setName("laptop");
		categories.add(category);
		
		
	}
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

}
