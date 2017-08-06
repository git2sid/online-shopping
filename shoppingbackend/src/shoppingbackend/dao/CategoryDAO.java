package shoppingbackend.dao;
import java.util.List;

import org.springframework.stereotype.Component;

import shoppingbackend.dto.Category;
@Component("categorydao")
public interface CategoryDAO {

	
	List<Category> list();
}
