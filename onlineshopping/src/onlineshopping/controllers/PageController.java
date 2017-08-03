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
		mv.addObject("greeting","hello from siddharth");
		return mv;
	}
}
