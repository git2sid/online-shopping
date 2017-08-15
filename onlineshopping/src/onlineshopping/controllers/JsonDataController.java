package onlineshopping.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import shoppingbackend.dao.ProductDAO;
import shoppingbackend.dto.Category;
import shoppingbackend.dto.Product;

@Controller
@RequestMapping("/json/data")
public class JsonDataController {
	
	@Autowired   
	ProductDAO productDAO;
	@ResponseBody
	@RequestMapping("/all/products")
	public List<Product> showdata()
	{
		return  productDAO.list();
	}
@ResponseBody
	@RequestMapping(value= {"/category/{id}/products"})
	public List<Product> showCategoryProductsJson(@PathVariable("id") int id)
	{
		System.out.println("list of products is"+productDAO.listActiveProductsByCategory(id));
		return productDAO.listActiveProductsByCategory(id);
	}
	
	
}
