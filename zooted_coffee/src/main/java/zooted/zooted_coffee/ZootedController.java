package zooted.zooted_coffee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class ZootedController {
	
	@Autowired
	private ZootedMenu zootedMenu;
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
		mv.addObject("zootedmenu", zootedMenu.getMenuItems());
		//mv.addObject menu items.get all items talk to sophia about this
		return mv;
	}
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	

}
