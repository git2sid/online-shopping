package onlineshopping.exceptions;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalDefaultExceptionHandler {

	@ExceptionHandler(NoHandlerFoundException.class)
	public ModelAndView handlerNoHandlerFoundException()
	{
		ModelAndView mv= new ModelAndView("error");
		mv.addObject("errorTitle", "the page is nt made yet");
		mv.addObject("title", "4040 error page");
		mv.addObject("errorDescription", "ask your administrator for further details");
		return mv;
		
	}
}
