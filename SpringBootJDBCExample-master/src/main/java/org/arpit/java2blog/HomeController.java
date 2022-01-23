
package org.arpit.java2blog;

import java.util.List;

import org.arpit.java2blog.model.Student;
import org.arpit.java2blog.repository.StudentRepositoryImpl;
import org.arpit.java2blog.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.batch.BatchAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;    
import org.springframework.beans.factory.annotation.Autowired;    
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.ModelAttribute;    
import org.springframework.web.bind.annotation.PathVariable;    
import org.springframework.web.bind.annotation.RequestMapping;    
import org.springframework.web.bind.annotation.RequestMethod;     
 


@Controller


public class HomeController {

	@Autowired
	Student student;

	@Autowired
	StudentService studentService;
	
	 @RequestMapping("/Liststudents")    
	    public String viewemp(Model m){    
	       // List<Student> listp =;    
		 
		 // System.out.println("students: "+productsService.findAll());
	       m.addAttribute("Students",studentService.findAll());  
	        return "liststudent";    
	    }    
	/*
	 * @RequestMapping(value = "/allEmployees", method = RequestMethod.GET) public
	 * String getAllEmployees(@ModelAttribute("employeeListForm") EmployeeListForm
	 * employeeListForm, HttpServletRequest request, HttpServletResponse response,
	 * Model model, BindingResult errors) throws Exception { List<Employee> subList
	 * = null; allEmployees = empService.getAllEmployees(categoryId);
	 * employeeListForm.setAllEmployees("allEmployees");
	 * employeeListForm.setCategory("IT"); model.addAttribute("etcSearchForm",
	 * etcSearchForm); return ALL_EMP_VIEW; }
	 */
	/*
	 * @RequestMapping(value = "/Lists", method = RequestMethod.GET) public
	 * ModelAndView passParametersWithModelAndView() {
	 * 
	 * ModelAndView modelAndView = new ModelAndView("listproduct");
	 * modelAndView.addObject("Products", productsService.findAll()); return
	 * modelAndView; }
	 */
	
}
