package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.services.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(path="/contact",method=RequestMethod.GET)
	public String showFrom(){
		return "contact";
	}
	
	@RequestMapping(path="/processForm",method=RequestMethod.POST)
	public String processForm(@ModelAttribute User user, Model model){   //handles @RequestParam("email") mapping and object value seeting
		   int createdUser = (Integer)this.userService.createUser(user);
		   model.addAttribute("successMessage",createdUser);
	       System.out.println("user"+user);
	       if(user.getUserName().isBlank()) {
	    	   return "redirect:/contact";
	       }
		
		return "success";
	}
	
	/*@RequestMapping(path="/processForm",method=RequestMethod.POST)
	public String processForm(@RequestParam("name") String userName,
			@RequestParam("email") String userEmail,
			@RequestParam("password") String userPassword, Model model){
		
		   User user = new User();
		   user.setUserEmail(userName);
		   user.setUserName(userEmail);
		   user.setUserPassword(userPassword);
		
		   model.addAttribute("user",user);
		   
	       System.out.println("user"+user);
		
		return "success";
	}*/
}

