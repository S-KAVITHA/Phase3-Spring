package com.javainterviewpoint;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MVC_Contoller 
{
 @RequestMapping("/HelloWorld")
 public ModelAndView Welcome()
 {
 String message = "Welcome to JavaInterviewPoint Spring 3 MVC Tutorial";
 return new ModelAndView("Welcome","message",message);
 }
}