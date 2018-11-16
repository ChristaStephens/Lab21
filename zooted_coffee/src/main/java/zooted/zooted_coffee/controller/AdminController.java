package zooted.zooted_coffee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import zooted.zooted_coffee.bean.MenuItem;
import zooted.zooted_coffee.bean.ZootedMenu;
import zooted.zooted_coffee.dao.MenuItemDao;

@Controller
public class AdminController {

	@Autowired
	protected MenuItemDao menuItemDao;
	
	@RequestMapping("/admin")
	public ModelAndView index() {
		// will handle the home/index html page

		return new ModelAndView("admin");

	}

	@RequestMapping("/admin/menu")
	public ModelAndView showAdminMenu() {
		ModelAndView mv = new ModelAndView ("adminmenu");
		//this method allows us to pull all the info from the menu
		//to give it to the chrome browser
		//
				mv.addObject("zootedmenu",menuItemDao.findAll());
		return mv;
	}

	@RequestMapping("/item/added")
	// maybe a redirect so that they can't add it twice?
	
	//sending information from java bean to controller
	public ModelAndView addItem(MenuItem menuItem) {
		menuItemDao.create(menuItem);
		return new ModelAndView("redirect:/admin/menu");
	}
	
	
	@RequestMapping("/item/create")
	public ModelAndView showCreateForm() {
		// If there is only one model value to add, use this one-line shortcut. Equivalent to
		// ModelAndView mav = new ModelAndView("food-form");
		// mav.addObject("title", "Add a Food");
		return new ModelAndView("menu-form", "title", "Add a Food");
	}

	@RequestMapping("/item/removed")
	// maybe a redirect here as well
	public ModelAndView removeItem(MenuItem menuItem) {
		//can use to carry the menu over with the dao, needs to be auto wired
		menuItemDao.delete(menuItem);
		return new ModelAndView("rederiect:/admin/menu");
	}
	
	@RequestMapping("/item/delete")
	public ModelAndView showDeleteForm() {
		
		return new ModelAndView ("delete-form");
	}
}
