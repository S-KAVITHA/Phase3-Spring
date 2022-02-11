
package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Feedback;

import com.example.demo.repository.FeedbackRepository;

//@author Kavitha S

@RestController

@RequestMapping("feedback")
public class Rest_Controller {

	@Autowired
	FeedbackRepository feedbackrepo;

	@GetMapping("Listfeedback")
	public List<Feedback> getAllfeedback() {
		List<Feedback> feedback = (List<Feedback>) feedbackrepo.findAll();
		return feedback;
	}

	@PostMapping("addfeedback")
	public Feedback addfeedbacks(@RequestBody Feedback feedback) {
		return feedbackrepo.save(feedback);
	}

	@GetMapping("feedback/{id}")
	public Optional<Feedback> getfeedbackById(@PathVariable int id) {

		return feedbackrepo.findById(id);
	}

	@PutMapping("updatefeedback/{id}")
	public Feedback updatefeedbackById(@RequestBody Feedback feedback, @PathVariable int id) {
		feedback.setId(id);
		return feedbackrepo.save(feedback);
	}

	@DeleteMapping("deletefeedback/{id}")
	public void deletefeedback(@PathVariable int id) {
		feedbackrepo.deleteById(id);
	}

}
