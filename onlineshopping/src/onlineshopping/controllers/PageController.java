package onlineshopping.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	
	@RequestMapping(value= {"/","/home","/index"})
	public ModelAndView page()
	{
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("title","home");
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
	
	
	
}
