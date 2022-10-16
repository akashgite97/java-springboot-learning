package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/root")
public class HomeController {

	@RequestMapping(path="/home",method=RequestMethod.GET)
	public String home(Model model) {
		System.out.print("HomeUrl");
		model.addAttribute("name", "akash gite");
		return "index";
	}
	
	@RequestMapping("/about")
	public String about(Model model) {
		System.out.print("HomeUrl");
		model.addAttribute("name", "akash gite");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help(Model model) {
		//creating model and view object
		ModelAndView modelAndview = new ModelAndView();
		modelAndview.addObject("name","model and view");
		modelAndview.setViewName("help");
		return modelAndview;
	}
}

