package shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import shoppingbackend.dao.ProductDAO;

import shoppingbackend.dto.Product;

public class ProductTestCase {
	
	private static AnnotationConfigApplicationContext context;
	private static ProductDAO productDAO;
	private static Product product;
	
	@BeforeClass
	public static void init()
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("shoppingbackend");
		context.refresh();
		productDAO=(ProductDAO)context.getBean("productDAO");
		
		
		
	}
	
	
	
	/*@Test
	public void testCRUDProduct()
	{
		
		product=new Product();
		//create a new product
		product.setName("Oppo");
		product.setBrand("oppo");
		product.setDescription("chinese");
		product.setUnitPrice(72000);
	    product.setActive(true);
		product.setCategoryId(3);
		product.setSupplierId(3);
		assertEquals("successfully added a new product", true,productDAO.add(product));

	//update and fetch
		product=productDAO.get(2);
		product.setName("samasung galaxy 7");
		System.out.println(product);
		assertEquals("successfully updated a product",true,productDAO.update(product));
		
		

		//delete category
		product=productDAO.get(2);
		
		assertEquals("successfully deleted a category",true,productDAO.delete(product));
		
		
		
		//fetching the list of category	
int size=productDAO.list().size();
	assertEquals("successfully got list of category",size,productDAO.list().size());

		
	
	}
	*/
	
/*	@Test
	public void testListActiveProducts()
	{
		assertEquals("the products are",5,productDAO.listActiveProducts().size());
	}
*//*
	@Test
	public void testActiveProductsById()
	{
		assertEquals("the products are",3,productDAO.listActiveProductsByCategory(3).size());	
	}*/
	

	@Test
	public void testActiveProductCount()
	{
		assertEquals("the products are",3,productDAO.getLatestActiveProducts(3).size());	
	}
}
