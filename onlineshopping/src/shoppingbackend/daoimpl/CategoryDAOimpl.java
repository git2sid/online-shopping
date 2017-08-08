package shoppingbackend.daoimpl;

import java.util.ArrayList;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import shoppingbackend.dao.CategoryDAO;
import shoppingbackend.dto.Category;


@Component
@Repository("categoryDAO")
@Transactional
public class CategoryDAOimpl implements CategoryDAO{

	@Autowired
	private SessionFactory sessionFactory;
	private static List<Category> categories= new ArrayList<>();
	/*static {
		Category category=new Category();
		category.setDescription("laptop is good");
		category.setId("1");
		category.setImageURL("img_1.png");
		category.setName("laptop");
		Category category2=new Category();
		category2.setDescription("laptop is good");
		category2.setId("2");
		category2.setImageURL("img_1.png");
		category2.setName("watch");
		Category category3=new Category();
		category3.setDescription("laptop is good");
		category3.setId("3");
		category3.setImageURL("img_1.png");
		category3.setName("mobile");
		Category category4=new Category();
		category4.setDescription("laptop is good");
		category4.setId("4");
		category4.setImageURL("img_1.png");
		category4.setName("gooleGlass");
		categories.add(category);
		categories.add(category2);
		categories.add(category3);
		categories.add(category4);
		
		
	}*/
	@Override
	public List<Category> list() {
		String selectActiveCategory="FROM Category WHERE active=:active";
		Query query=sessionFactory.getCurrentSession().createQuery(selectActiveCategory);
		query.setParameter("active", true);
		
		return query.getResultList();
	}
	
	/*getting single category based on id*/
	@Override
	public Category getId(int id) {
		/*System.out.println("inside getId() method "+id);
		for(Category category:categories)
		{
			if(category.getId().equals(id))
			{
				System.out.println("category matched");
				return category;
			}
		}*/
		
		
		
		return sessionFactory.getCurrentSession().get(Category.class,Integer.valueOf(id));
		
	}
	@Override
	@Transactional
	public boolean addCategory(Category category) {
		// TODO Auto-generated method stub
		try
		{
		sessionFactory.getCurrentSession().persist(category);
		return true;
		}
		
		catch(Exception e)
		{
			System.out.println("from session catch");
			e.printStackTrace();
			return false;	
		}
		
	}
	@Override
	public boolean updateCategory(Category category) {
		try
		{
		sessionFactory.getCurrentSession().update(category);
		return true;
		}
		
		catch(Exception e)
		{
			System.out.println("from session catch");
			e.printStackTrace();
			return false;	
		}
		
	}
	@Override
	public boolean deleteCategory(Category category) {
		category.setActive(false);
		try
		{
			System.out.println("inside try part");
		sessionFactory.getCurrentSession().update(category);
		return true;
		}
		
		catch(Exception e)
		{
			System.out.println("from session catch");
			e.printStackTrace();
			return false;	
		}
	}

}
