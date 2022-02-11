package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Feedback;
import com.example.demo.repository.FeedbackRepository;


@Controller

public class Web_Controller {

	@Autowired
	FeedbackRepository feedbackrepo;
	

	
	@RequestMapping(value="/feedbackhome")
	public ModelAndView Feedbackhome() {
		ModelAndView modelAndView = new ModelAndView("userfeedback");
	
		return modelAndView;
	}
	
	
	@RequestMapping(value="addtotable")
	public ModelAndView Addtotable(Feedback feedback )  {
		ModelAndView modelAndView = new ModelAndView("userfeedback");
		modelAndView.addObject("response_feed", "Feedback Stored Succesfully  !!!");
	
		System.out.println("Model Attribute:"+feedback );
		feedbackrepo.save(feedback);
			    
		return modelAndView;
		
		
	}
		
}
