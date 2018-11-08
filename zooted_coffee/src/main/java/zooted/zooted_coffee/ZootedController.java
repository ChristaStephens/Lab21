package zooted.zooted_coffee;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ZootedController {
	@RequestMapping("/")
	public ModelAndView index() {
		// will handle the home/index html page

		return new ModelAndView("home");

	}
	
	@RequestMapping("/userreg")
	public ModelAndView showForm() {
		return new ModelAndView("/userreg");
	}
	
	@RequestMapping("/summary_page.php")
	public ModelAndView showSummary( @RequestParam ("name") String name, 
			@RequestParam("coffee") String coffee, @RequestParam("bday") String bday, @RequestParam("email") String email) {
		ModelAndView mv = new ModelAndView("summary");
		mv.addObject("name", name);
		mv.addObject("bday", bday);
		mv.addObject("coffee", coffee);
		mv.addObject("email", email);
		
		return mv;
	}

}
