package onlineshopping.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import shoppingbackend.dao.CategoryDAO;
import shoppingbackend.dto.Category;
//import shoppingbackend.daoimpl.CategoryDAOimpl;

@Controller
public class PageController {

	@Autowired
	private CategoryDAO categoryDAO;
	
	
	@RequestMapping(value= {"/","/home","/index"})
	public ModelAndView page()
	{
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("title","home");
		mv.addObject("categories",categoryDAO.list());
		mv.addObject("userClickHome",true);
		return mv;
	}
	
	@RequestMapping(value= {"/contact"})
	public ModelAndView contact()
	{
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("title","ContactUs");
		mv.addObject("userClickcontact",true);
		return mv;
	}
	
	@RequestMapping(value= {"/products"})
	public ModelAndView products()
	{
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("title","Products");
		mv.addObject("userClickProducts",true);
		return mv;
	}
	
	@RequestMapping(value= {"/about"})
	public ModelAndView about()
	{
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("title","AboutUs");
		mv.addObject("userClickAbout",true);
		return mv;
	}
	@RequestMapping(value= {"/view/all/products"})
	public ModelAndView showAllProducts()
	{
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("title","All Products");
		mv.addObject("categories",categoryDAO.list());
		mv.addObject("userClickAllProducts",true);
		return mv;
	}
	
	@RequestMapping(value= {"/show/category/{id}/products"})
	public ModelAndView showCategoryProducts(@PathVariable("id") int id)
	{
		
		System.out.println("inside controller");
		//categoryDAO to fetch single category
		Category category=null;
		category=categoryDAO.getId(id);
		System.out.println("the category is "+category.getName());
		
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("title",category.getName());
		mv.addObject("category",category);
		mv.addObject("categories",categoryDAO.list());
		mv.addObject("userClickCategoryProducts",true);
		return mv;
	}
	
	
	
}
