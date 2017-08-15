package onlineshopping.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import onlineshopping.util.FileUploadUtility;
import shoppingbackend.dao.CategoryDAO;
import shoppingbackend.dao.ProductDAO;
import shoppingbackend.dto.Category;
import shoppingbackend.dto.Product;

@Controller
@RequestMapping(value="/manage")
public class ManagementController {
	
	private static final Logger logger=LoggerFactory.getLogger(ManagementController.class);
	
	@Autowired
	private CategoryDAO categoryDAO;
	
@Autowired
	private ProductDAO productDAO;
	
	
/*@RequestMapping( value="/products" , method=RequestMethod.GET)
public ModelAndView showManageProducts(@RequestParam(name="operation" , required=false) String operation)
{
	ModelAndView mv=new ModelAndView("index");
	mv.addObject("userClickManageProducts",true);
	mv.addObject("title","Manage Produts");
	Product nProduct=new Product();
	nProduct.setActive(true);
	nProduct.setSupplierId(1);
	mv.addObject("command",nProduct);
	if(operation.equals("product"))
	{
		mv.addObject("message","Product submitted successfully");
	}
	return mv;
}*/
	
	@RequestMapping( value="/products" , method=RequestMethod.GET)
	public ModelAndView showManageProducts(@RequestParam(name="operation" , required=false) String operation)
	{
		ModelAndView mv=new ModelAndView("index");
		mv.addObject("userClickManageProducts",true);
		mv.addObject("title","Manage Produts");
		Product nProduct=new Product();
		nProduct.setActive(true);
		nProduct.setSupplierId(1);
		mv.addObject("command",nProduct);
		if(operation!=null)
		{
		if(operation.equals("product"))
		{
			mv.addObject("message","Product submitted successfully");
		}
		}
		return mv;
	}

@ModelAttribute("categories")
public List<Category> getCategories()
{
	return categoryDAO.list();
}

@RequestMapping( value="/products" , method=RequestMethod.POST)
public String handleProductSubmission(@Valid @ModelAttribute("command") Product mproduct,BindingResult result,Model model,HttpServletRequest request)
{
	//note here the imported model is of spring ui type
	
	if(result.hasErrors())
	{
		model.addAttribute("userClickManageProducts",true);
		model.addAttribute("title","Manage Produts");
	return "index";
	
	//note in case of redirect here the error messages will not be seen.
	}
	logger.info(mproduct.toString());
	productDAO.add(mproduct);
	if(!mproduct.getFile().getOriginalFilename().equals(""))
	{
		System.out.println("inside the caller method of file uploader in controller ");
		FileUploadUtility.uploadFile(request,mproduct.getFile(),mproduct.getCode());
		System.out.println("outside the caller method of file uploader in controller ");
	}
	
	return "redirect:/manage/products?operation=product";
}





}
