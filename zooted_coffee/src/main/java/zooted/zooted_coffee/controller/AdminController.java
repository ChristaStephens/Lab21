package zooted.zooted_coffee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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

	@RequestMapping("/admin/menu/add")
	// maybe a redirect so that they can't add it twice?
	public ModelAndView addItem() {
		return new ModelAndView("adminadd");
	}

	@RequestMapping("/admin/menu/edit")
	// maybe a redirect here as well
	public ModelAndView editItem() {
		return new ModelAndView("adminedit");
	}
}
