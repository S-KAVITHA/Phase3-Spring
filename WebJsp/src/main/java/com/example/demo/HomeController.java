package com.example.demo;

import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.model.User;

@Controller
//@RequestMapping("view")
public class HomeController {

	@RequestMapping(value = "/tt", method = RequestMethod.GET)

	public ModelAndView hello(HttpServletResponse response) throws IOException {
		ModelAndView mv = new ModelAndView();
		mv.addObject("greeting", "Greeting from javaspringclub!!!!!!");
		mv.setViewName("empform");
		return mv;
	}

	@RequestMapping(value = "/tt1", method = RequestMethod.GET)

	public ModelAndView hello1(HttpServletResponse response) throws IOException {
		ModelAndView mv1 = new ModelAndView();
		mv1.addObject("greeting", "Greeting from javaspringclub!!!!!!");
		mv1.setViewName("home");
		return mv1;
	}


	@RequestMapping(value = "/welcome", method = RequestMethod.GET)

	public ModelAndView hello11(HttpServletResponse response) throws IOException {
		ModelAndView mv1 = new ModelAndView();
		mv1.addObject("greeting", "Greeting from javaspringclub!!!!!!");
		mv1.setViewName("welcome");
		return mv1;
	}

}