package zooted.zooted_coffee.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import zooted.zooted_coffee.bean.ZootedUser;
import zooted.zooted_coffee.dao.MenuItemDao;
import zooted.zooted_coffee.dao.ZootedUserDao;



@Controller
public class ZootedController {
	
	@Autowired
	private MenuItemDao menuItemDao;
	//use david's example of wiring daos 
	
	//need to autowire the name of the variable
	@Autowired
	private ZootedUserDao zootedUserDao;
	
	

	//always this way with Singletons
	//creates a connection
	
	@RequestMapping("/")
	public ModelAndView index() {
		// will handle the home/index html page

		return new ModelAndView("home");

	}
	
	@RequestMapping("/userreg")
	public ModelAndView showForm() {
		return new ModelAndView("/userreg");
	}
	
	@RequestMapping("/summary")
	//no php at end
	
	
	//mv.addobect means to output to the page!
	public ModelAndView showSummary( @RequestParam ("name") String name, 
			@RequestParam("last") String last,
			@RequestParam("coffee") String coffee,
			@RequestParam("bday") String bday,
			@RequestParam("email") String email, 
			@RequestParam (name ="updates", required= false) String updates, 
			@RequestParam (name ="sal", required= false) String sal){
		ModelAndView mv = new ModelAndView("summary");
		mv.addObject("name", name);
		mv.addObject("last", last);
		mv.addObject("bday", bday);
		mv.addObject("coffee", coffee);
		mv.addObject("email", email);
		mv.addObject("updates", updates);
		mv.addObject("sal", sal);
		//for updates to show or not show we need to say "name updates, req false"
				//to say that's it's not required to put int a check mark
		return mv;
	}
	
	@RequestMapping("/menu")
	public ModelAndView showMenu() {
		ModelAndView mv = new ModelAndView ("menu");
		mv.addObject("zootedmenu", menuItemDao.findAll());
		//mv.addObject menu items.get all items talk to sophia about this
		return mv;
	}
	
	@RequestMapping("/users")
	public ModelAndView showUsers() {
		ModelAndView mv = new ModelAndView ("users");
		mv.addObject("zooteduser", zootedUserDao.findAllUsers());
		
		return mv;
	}
	
	@RequestMapping("/user/create")
	public ModelAndView showCreateForm() {
		// If there is only one model value to add, use this one-line shortcut. Equivalent to
		// ModelAndView mav = new ModelAndView("food-form");
		// mav.addObject("title", "Add a Food");
		return new ModelAndView("users", "title", "Add a Food");
	}
	
	@RequestMapping("/user/added")
	// maybe a redirect so that they can't add it twice?
	
	//sending information from java bean to controller
	public ModelAndView addUsers(ZootedUser zootedUser) {
		zootedUserDao.create(zootedUser);
		return new ModelAndView("redirect:/users");
	}
	


}
