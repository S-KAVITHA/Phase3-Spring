package com.example.demo.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.model.Admin;
import com.example.demo.model.Categorys;
import com.example.demo.model.Color;
import com.example.demo.model.Product;
import com.example.demo.model.Season;
import com.example.demo.model.ShoeType;
import com.example.demo.repository.AdminRepository;
import com.example.demo.repository.CategorysRepository;
import com.example.demo.repository.ProductRepository;
import com.example.demo.repository.PurchaseItemRepository;
import com.example.demo.repository.UserRepository;

@Controller
//@Scope("session")

public class AdminController {

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
		Boolean get_pwd = adminrepo.existsByadminpwd(adminPwd);

		if (get_Id && get_pwd) {
			map.addAttribute("adminId", adminId);
			map.addAttribute("adminPwd", adminPwd);
			return "admin/dashboard";

		} else {

			map.addAttribute("message", "Admin login failed");
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

		ModelAndView modelAndView = new ModelAndView("admin/addprodstore");
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		String todaysdate = dateFormat.format(date);
		product.setCreatedDate(todaysdate);
		productrepo.save(product);
		System.out.println(product);
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

		ModelAndView modelAndView = new ModelAndView("admin/listproduct");
		modelAndView.addObject("products", productrepo.findAll());

		return modelAndView;
	}

	@RequestMapping(value = "/editprod/{id}")
	public String editprod(@PathVariable Long id, Model m) {
		m.addAttribute("products", productrepo.findById(id).get());
		System.out.println(productrepo.findById(id).get());
		return "admin/updateproduct";
	}

	@RequestMapping(value = "/Save/{id}")
	public ModelAndView saveprod(@PathVariable Long id, Product product) {

		ModelAndView modelAndView = new ModelAndView("admin/updprodstore");
		System.out.println(product);
		product.setProductId(id);
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		String todaysdate = dateFormat.format(date);
		product.setCreatedDate(todaysdate);

		System.out.println(product);
		productrepo.save(product);
		modelAndView.addObject("prod", product);
		return modelAndView;
	}

	@RequestMapping(value = "/deleteprod/{id}")
	public String deleteprod(@PathVariable long id, Model m) {
		productrepo.deleteById(id);
		m.addAttribute(id);
		return "/admin/deleteproduct";
	}

	@RequestMapping("/Listusers")
	public ModelAndView ListUsers() {

		ModelAndView modelAndView = new ModelAndView("admin/listusers");
		modelAndView.addObject("users", userrepo.findAll());

		return modelAndView;
	}

	@RequestMapping("/ListPurchases")
	public ModelAndView ListPurchases() {

		ModelAndView modelAndView = new ModelAndView("admin/listpurchases");
		modelAndView.addObject("purchases", purchaseitemrepo.findAll());

		return modelAndView;
	}

	@RequestMapping(value = "/adminchangepwd/{adminId}/{adminPwd}")
	public ModelAndView Adminchangepwd(@PathVariable String adminId, @PathVariable String adminPwd) {

		ModelAndView modelAndView = new ModelAndView("admin/adminchangepwd");
		Admin admin = adminrepo.findByadminIdAndadminpwd(adminId, adminPwd);
		System.out.println(admin);
		Long get_adminid = admin.getID();
		System.out.println(get_adminid);
		modelAndView.addObject("admin", admin);
		return modelAndView;
	}

	@RequestMapping(value = "/Saveadminpwd/{id}")
	public ModelAndView saveadminpwd(@PathVariable Long id, Admin admin) {

		ModelAndView modelAndView = new ModelAndView("admin/saveadminpwd");

		System.out.println(admin);
		System.out.println(id);
		adminrepo.save(admin);
		modelAndView.addObject("id", id);
		return modelAndView;
	}
	
	@RequestMapping("/Logout")
	public ModelAndView LogoutHomePage() {

		ModelAndView modelAndView = new ModelAndView("admin/Adminlogin");
		modelAndView.addObject("message","You have logged out successfully");
		return modelAndView;
	}

}
