package zooted.zooted_coffee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import zooted.zooted_coffee.dao.CartItemDao;

@Controller
public class CartController {

	@Autowired
	private CartItemDao cartItemDao;
	
	
	@RequestMapping("/cart")
	public ModelAndView showCart(){
		ModelAndView mv = new ModelAndView ("cart");
		mv.addObject("cartItem",cartItemDao.findAll());
		return mv;
		
			
			//this method allows us to pull all the info from the menu
			//to give it to the chrome browser
			//
					
		}
	
}
