package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController
{
  String message = "Welcome to Spring MVC!";
  
  @RequestMapping(value="/home")
	public ModelAndView Feedbackhome() {
		ModelAndView modelAndView = new ModelAndView("welcome");
	
		return modelAndView;
	}
	
	/*
	 * @RequestMapping(value = "/hello", method = RequestMethod.GET) public
	 * ModelAndView showMessage(
	 * 
	 * @RequestParam(value = "name", required = false, defaultValue = "World")
	 * String name) { System.out.println("in controller");
	 * 
	 * ModelAndView mv = new ModelAndView("helloworld.jsp"); mv.addObject("message",
	 * message); mv.addObject("name", name); return mv; }
	 */
}