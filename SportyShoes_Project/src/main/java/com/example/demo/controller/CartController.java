package com.example.demo.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.CartItem;
import com.example.demo.model.Product;
import com.example.demo.repository.CartItemRepository;
import com.example.demo.repository.ProductRepository;

@Controller
public class CartController {

	@Autowired
	private CartItemRepository cartrepo;

	@Autowired
	private ProductRepository productrepo;

	@RequestMapping(value = "/buy/{id}/{userId}", method = RequestMethod.GET)
	public String buy(@PathVariable("id") Long id,@PathVariable("userId") String userId, HttpSession session, CartItem cartitm) {
		//Product productModel = new Product();
		if (session.getAttribute("cart") == null) {
			//List<CartItem> cart = new ArrayList<CartItem>();
			Optional<Product> optproduct = productrepo.findById(id);
			Product product = optproduct.get();
			Long get_prodId = product.getProductId();
			String get_prodName = product.getName();
			Float get_prodPrice = product.getPrice();
			cartitm.setId(userId);
			cartitm.setProductId(get_prodId);
			cartitm.setName(get_prodName);
			cartitm.setPrice(get_prodPrice);
				System.out.println(cartitm);	
			cartrepo.save(cartitm);
			
			session.setAttribute("cart", cartitm);
		} /*
			 * else { List<CartItem> cart = (List<CartItem>) session.getAttribute("cart");
			 * int index = this.exists(id, cart); if (index == -1) { cart.add(new
			 * CartItem(productrepo.findAllById(id),1)); } else { int quantity =
			 * cart.get(index).getQuantity() + 1; cart.get(index).setQuantity(quantity); }
			 * session.setAttribute("cart", cart); }
			 */
		return "redirect:/cart/cartlist";
	}

	
	

	/*
	 * @RequestMapping(value = "/cartdeleteitem", method = RequestMethod.GET) public
	 * String cartDeleteItem(ModelMap map, javax.servlet.http.HttpServletRequest
	 * request,
	 * 
	 * @RequestParam(value = "id", required = true) String id) { // check if user is
	 * logged in HttpSession session = request.getSession(); if
	 * (session.getAttribute("user_id") == null) { map.addAttribute("error",
	 * "Error, You need to login before deleting items from cart"); } else { long
	 * idValue = Long.parseLong(id); List<CartItem> cartItems = new
	 * ArrayList<CartItem>(); if (session.getAttribute("cart_items") != null)
	 * cartItems = (List<CartItem>) session.getAttribute("cart_items");
	 * 
	 * for (CartItem item : cartItems) { if (item.getProductId() == idValue) {
	 * cartItems.remove(item); session.setAttribute("cart_items", cartItems); break;
	 * } } } return "redirect:cart"; }
	 * 
	 * @RequestMapping(value = "/checkout", method = RequestMethod.GET) public
	 * String checkout(ModelMap map, javax.servlet.http.HttpServletRequest request)
	 * { // check if user is logged in HttpSession session = request.getSession();
	 * if (session.getAttribute("user_id") == null) { map.addAttribute("error",
	 * "Error, You need to login before checking out"); } else { List<CartItem>
	 * cartItems = new ArrayList<CartItem>(); if (session.getAttribute("cart_items")
	 * != null) cartItems = (List<CartItem>) session.getAttribute("cart_items");
	 * BigDecimal totalValue = getCartValue(cartItems);
	 * map.addAttribute("cartValue", totalValue); map.addAttribute("cartItems",
	 * cartItems); } map.addAttribute("pageTitle", "SPORTY SHOES - CHECKOUT");
	 * return "checkout"; }
	 * 
	 * @RequestMapping(value = "/completepurchase", method = RequestMethod.GET)
	 * public String completePurchase(ModelMap map,
	 * javax.servlet.http.HttpServletRequest request) { // check if user is logged
	 * in HttpSession session = request.getSession(); if
	 * (session.getAttribute("user_id") == null) { map.addAttribute("error",
	 * "Error, You need to login before completing purchase"); } else { // take
	 * items from cart and update the databae List<CartItem> cartItems = new
	 * ArrayList<CartItem>(); if (session.getAttribute("cart_items") != null)
	 * cartItems = (List<CartItem>) session.getAttribute("cart_items"); BigDecimal
	 * totalValue = getCartValue(cartItems);
	 * 
	 * long userId = (Long) session.getAttribute("user_id");
	 * 
	 * Purchase purchase = new Purchase(); purchase.setUserId(userId);
	 * purchase.setDate(Calendar.getInstance().getTime());
	 * purchase.setTotal(totalValue); long purchaseId =
	 * purchaseService.updatePurchase(purchase);
	 * 
	 * for (CartItem item : cartItems) { PurchaseItem pItem = new PurchaseItem();
	 * pItem.setPurchaseId(purchaseId); pItem.setProductId(item.getProductId());
	 * pItem.setUserId(userId); pItem.setRate(item.getRate());
	 * pItem.setQty(item.getQty()); pItem.setPrice(item.getPrice());
	 * 
	 * purchaseItemService.updateItem(pItem); } map.addAttribute("cartValue",
	 * totalValue); map.addAttribute("cartItems", cartItems);
	 * 
	 * }
	 * 
	 * return "redirect:confirm"; }
	 * 
	 * @RequestMapping(value = "/gateway", method = RequestMethod.GET) public String
	 * gateway(ModelMap map, javax.servlet.http.HttpServletRequest request) { //
	 * check if user is logged in HttpSession session = request.getSession(); if
	 * (session.getAttribute("user_id") == null) { map.addAttribute("error",
	 * "Error, You need to login before making payment"); } else { List<CartItem>
	 * cartItems = new ArrayList<CartItem>(); if (session.getAttribute("cart_items")
	 * != null) cartItems = (List<CartItem>) session.getAttribute("cart_items");
	 * BigDecimal totalValue = getCartValue(cartItems);
	 * map.addAttribute("cartValue", totalValue); map.addAttribute("cartItems",
	 * cartItems);
	 * 
	 * }
	 * 
	 * map.addAttribute("pageTitle", "SPORTY SHOES - PAYMENT GATEWAY"); return
	 * "gateway"; }
	 * 
	 * @RequestMapping(value = "/confirm", method = RequestMethod.GET) public String
	 * confirm(ModelMap map, javax.servlet.http.HttpServletRequest request) { //
	 * check if user is logged in HttpSession session = request.getSession(); if
	 * (session.getAttribute("user_id") == null) { map.addAttribute("error",
	 * "Error, You need to login before completing the purchase"); } else { // clear
	 * items from cart as order has completed List<CartItem> cartItems = new
	 * ArrayList<CartItem>(); if (session.getAttribute("cart_items") != null)
	 * cartItems = (List<CartItem>) session.getAttribute("cart_items"); BigDecimal
	 * totalValue = getCartValue(cartItems); map.addAttribute("cartValue",
	 * totalValue);
	 * 
	 * cartItems.clear(); session.setAttribute("cart_items", null); }
	 * map.addAttribute("pageTitle", "SPORTY SHOES - PURCHASE CONFIRMATION"); return
	 * "confirm"; }
	 * 
	 *//**
		 * Check if an item is already in the cart
		 * 
		 * @param list
		 * @param item
		 * @return
		 */
	/*
	 * private boolean isItemInCart(List<CartItem> list, long item) { boolean retVal
	 * = false;
	 * 
	 * for (CartItem thisItem : list) { if (item == thisItem.getProductId()) {
	 * retVal = true; break; } } return retVal; }
	 * 
	 *//**
		 * Get total value of items in cart
		 * 
		 * @param list
		 * @return
		 *//*
			 * private BigDecimal getCartValue(List<CartItem> list) { BigDecimal total = new
			 * BigDecimal(0.0);
			 * 
			 * for (CartItem item : list) { BigDecimal dprice = item.getRate().multiply(new
			 * BigDecimal(item.getQty())); total = total.add(dprice); } return total; }
			 */
}
