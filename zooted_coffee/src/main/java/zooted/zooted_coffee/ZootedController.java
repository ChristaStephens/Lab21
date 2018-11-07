package zooted.zooted_coffee;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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

}
