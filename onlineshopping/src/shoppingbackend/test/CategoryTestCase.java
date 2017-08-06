package shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import shoppingbackend.dao.CategoryDAO;
import shoppingbackend.dto.Category;

public class CategoryTestCase {

	
	private static AnnotationConfigApplicationContext context;
	private static CategoryDAO categoryDAO;
	private static Category category;
	
	@BeforeClass
	public static void init()
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("shoppingbackend");
		context.refresh();
		categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
		
	}
/*	@Test
	public void testAddCategory()
	{
		category =new Category();
		category.setName("laptop");
		category.setDescription("school image");
		category.setImageURL("img1.png");
		assertEquals("successfully added a category",true,categoryDAO.addCategory(category));
		
		
		
		
		
	}*/
	
/*	testing based on id method*/
	/*@Test
	public void testGetCategory()
	{
		category=categoryDAO.getId(2);
		System.out.println(category);
		assertEquals("successfully added a category","chaudhary",category.getName());
	}*/
	
/*
 * means for updating u have to get the id and then set method and then call the update method.
 * */	
	/*@Test
	public void testUpdateCategory()
	{
		category=categoryDAO.getId(3);
		category.setName("tubelight");
		System.out.println(category);
		assertEquals("successfully updated a category",true,categoryDAO.updateCategory(category));
	}*/
	
	
/*	
	
	@Test
	public void testDeleteCategory()
	{
		category=categoryDAO.getId(3);
		
		assertEquals("successfully deleted a category",true,categoryDAO.deleteCategory(category));
		
		
		
		
	}*/
	
	
	
	
	
	/*@Test
	public void testListCategory()
	{
		
		
		assertEquals("successfully got list of category",2,categoryDAO.list().size());
		
		
		
		
	}*/
	
	@Test
	public void testCRUDCategory()
	{
		
		//for adding the data
		category =new Category();
		category.setName("laptop");
		category.setDescription("school image");
		category.setImageURL("img1.png");
		assertEquals("successfully added a category",true,categoryDAO.addCategory(category));
		category =new Category();
		category.setName("mouse");
		category.setDescription("school image");
		category.setImageURL("img2.png");
		assertEquals("successfully added a category",true,categoryDAO.addCategory(category));
		category =new Category();
		category.setName("freezer");
		category.setDescription("school image");
		category.setImageURL("img3.png");
		assertEquals("successfully added a category",true,categoryDAO.addCategory(category));
		
		
		//update and fetch cateegory
		category=categoryDAO.getId(3);
		category.setName("tubelight");
		System.out.println(category);
		assertEquals("successfully updated a category",true,categoryDAO.updateCategory(category));
		
		//delete category
	category=categoryDAO.getId(3);
		
		assertEquals("successfully deleted a category",true,categoryDAO.deleteCategory(category));
		
		
		//fetching the list of category
//		assertEquals("successfully got list of category",11,categoryDAO.list().size());
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
