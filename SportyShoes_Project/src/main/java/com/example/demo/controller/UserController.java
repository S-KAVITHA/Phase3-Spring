package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.IdentityType;
import com.example.demo.model.Season;
import com.example.demo.model.User;
import com.example.demo.repository.AdminRepository;
import com.example.demo.repository.CategorysRepository;
import com.example.demo.repository.ProductRepository;
import com.example.demo.repository.PurchaseItemRepository;
import com.example.demo.repository.UserRepository;

@Controller
//@Scope("session")

public class UserController {

	@Autowired
	AdminRepository adminrepo;

	@Autowired
	ProductRepository productrepo;

	@Autowired
	CategorysRepository categoryrepo;

	@Autowired
	UserRepository userrepo;

	@Autowired
	PurchaseItemRepository purchaseitemrepo;

	@RequestMapping("/UserLogin")
	public ModelAndView HomePage1() {

		ModelAndView modelAndView = new ModelAndView("user/userlogin");

		return modelAndView;
	}

	@RequestMapping("/Createuser")
	public ModelAndView RegisterUser() {

		ModelAndView modelAndView = new ModelAndView("user/register");
		List<IdentityType> type_list = new ArrayList<IdentityType>(Arrays.asList(IdentityType.values()));
		modelAndView.addObject("type_list", type_list);

		return modelAndView;
	}

	@RequestMapping("/usersubmit")
	public ModelAndView userloginAction(User user) {

		ModelAndView modelAndView = new ModelAndView();
		System.out.println(user);

		String emailId = user.getEmailId();
		String password = user.getPassword();
		
		
		Boolean get_Id = userrepo.existsByemailId(emailId);
		Boolean get_pwd = userrepo.existsBypassword(password);

		if (get_Id && get_pwd) {
			modelAndView.addObject("userId", emailId);
			modelAndView.addObject("userPwd", password);
			modelAndView.setViewName("user/userdashboard");
			return modelAndView;	

		} else {

			modelAndView.addObject("error", "User login failed");
			modelAndView.setViewName("user/userlogin");
			return modelAndView;
		}
	}

	@RequestMapping("/signupaction")
	public ModelAndView signupaction(User user) {

		ModelAndView modelAndView = new ModelAndView("user/register-confirm");
		userrepo.save(user);
		return modelAndView;
	}

	@RequestMapping("/userListPurchases")
	public ModelAndView ListPurchases() {

		ModelAndView modelAndView = new ModelAndView("admin/listpurchases");
		modelAndView.addObject("purchases", purchaseitemrepo.findAll());

		return modelAndView;
	}

	@RequestMapping(value = "/userchangepwd/{userId}/{userPwd}")
	public ModelAndView Adminchangepwd(@PathVariable String userId, @PathVariable String userPwd) {

		ModelAndView modelAndView = new ModelAndView("user/userchangepwd");
		List<User> user = userrepo.findByemailIdAndpassword(userId, userPwd);
		System.out.println(user);
		// Long get_adminid = user.g
		// System.out.println(get_adminid);
		modelAndView.addObject("user", user);
		return modelAndView;
	}

	@RequestMapping(value = "/Saveuserpwd/{id}")
	public ModelAndView saveadminpwd(@PathVariable Long id, User user) {

		ModelAndView modelAndView = new ModelAndView("admin/saveuserpwd");

		System.out.println(user);
		System.out.println(id);
		userrepo.save(user);
		modelAndView.addObject("id", id);
		return modelAndView;
	}

	@RequestMapping("/userLogout")
	public ModelAndView userLogoutHomePage() {

		ModelAndView modelAndView = new ModelAndView("user/userlogin");
		modelAndView.addObject("message", "You have logged out successfully");
		return modelAndView;
	}

	
	@RequestMapping("/ListuserProducts/{userId}")
	public ModelAndView Listadmin(@PathVariable String userId) {

		ModelAndView modelAndView = new ModelAndView("user/listuserproducts");
		modelAndView.addObject("userId", userId);
		modelAndView.addObject("products", productrepo.findAll());

		return modelAndView;
	}
	
	/*
	 * @RequestMapping("/buy/{id}") public ModelAndView Buyproduct(@PathVariable
	 * Long Id) {
	 * 
	 * ModelAndView modelAndView = new ModelAndView("user/buyproduct");
	 * modelAndView.addObject("products", productrepo.findAll());
	 * 
	 * return modelAndView; }
	 */
	
	@GetMapping("UserHome")
	public String Homepage(ModelMap map) {
		return "user/userdashboard";
	}

	
	
}
