package com.example.demo.controller;

import java.time.LocalDate;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Categorys;
import com.example.demo.model.Color;
import com.example.demo.model.Product;
import com.example.demo.model.Season;
import com.example.demo.model.ShoeType;
import com.example.demo.repository.AdminRepository;
import com.example.demo.repository.CategorysRepository;
import com.example.demo.repository.ProductRepository;

@Controller
//@Scope("session")

public class AdminController {

	@Autowired
	AdminRepository adminrepo;

	@Autowired
	ProductRepository productrepo;

	@Autowired
	CategorysRepository categoryrepo;
	
	

	@RequestMapping("/Admin")
	public ModelAndView HomePage() {

		ModelAndView modelAndView = new ModelAndView("admin/Adminlogin");

		return modelAndView;
	}

	
	
	@GetMapping("adminsubmit")
	public String loginAction(ModelMap map, javax.servlet.http.HttpServletRequest request,
			@RequestParam(value = "admin_id", required = true) String adminId,
			@RequestParam(value = "pwd", required = true) String adminPwd) {

		Boolean get_Id = adminrepo.existsByadminId(adminId);
		Boolean get_pwd = adminrepo.existsBypwd(adminPwd);

		if (get_Id && get_pwd) {

			return "admin/dashboard";

		} else {

			map.addAttribute("error", "Admin login failed");
			return "admin/Adminlogin";
		}
	}

	
	
	@GetMapping("Home")
	public String Homepage(ModelMap map) {
		return "admin/dashboard";
	}

	
	
	@RequestMapping("/adminproducts")
	public ModelAndView AddProducts() {

		ModelAndView modelAndView = new ModelAndView("admin/addproduct");
		List<Season> type_list = new ArrayList<Season>(Arrays.asList(Season.values()));
		modelAndView.addObject("type_list", type_list);

		List<ShoeType> Shoe_list = new ArrayList<ShoeType>(Arrays.asList(ShoeType.values()));
		modelAndView.addObject("Shoe_list", Shoe_list);
		
		List<Color> Color_list = new ArrayList<Color>(Arrays.asList(Color.values()));
		modelAndView.addObject("Color_list", Color_list);

		List<Categorys> cat_list = (List<Categorys>) categoryrepo.findAll();
		modelAndView.addObject("categories", cat_list);

		return modelAndView;
	}

	
	
	@RequestMapping("/addtotable")
	public ModelAndView Addtotable(Product product) throws ParseException {

		ModelAndView modelAndView = new ModelAndView("admin/addproduct");
		 DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
         Calendar cal = Calendar.getInstance();
         Date date = cal.getTime();
         String todaysdate = dateFormat.format(date);
          System.out.println("Today's date : " + todaysdate);
          
		product.setCreatedDate(todaysdate);
		productrepo.save(product);
		System.out.println(product);
		modelAndView.addObject("message", "Product added Successfully!!!");
		return modelAndView;
	}

	
	
	@RequestMapping("/admincategories")
	public ModelAndView AddCategory() {

		ModelAndView modelAndView = new ModelAndView("admin/addcategory");
		return modelAndView;
	}

	
	
	@RequestMapping("/addcattotable")
	public ModelAndView Addcattotable(Categorys category) {

		ModelAndView modelAndView = new ModelAndView("admin/addcategory");
		
		categoryrepo.save(category);
		System.out.println(category);
		modelAndView.addObject("message", "Category added Successfully!!!");
		return modelAndView;
	}

	

	@RequestMapping("/ListProducts")
	public ModelAndView Listadmin() {

		ModelAndView modelAndView = new ModelAndView("listproduct");
		modelAndView.addObject("products", productrepo.findAll());
		return modelAndView;
	}

	
}
