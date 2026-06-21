package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {
	
	@RequestMapping("/contact")
	public String contact() {
		return "contact";
	}
	
	@RequestMapping(path="/processform", method=RequestMethod.POST)
	public String handleForm(
	        @RequestParam("name") String name,
	        @RequestParam("mob") String mob,
	        @RequestParam("email") String email,
	        @RequestParam("password") String password, Model model) {

	    System.out.println("Name: " + name);
	    System.out.println("Mobile: " + mob);
	    System.out.println("Email: " + email);
	    System.out.println("Password: " + password);
	    
	    model.addAttribute("name",name);
	    model.addAttribute("mob",mob);
	    model.addAttribute("email",email);
	    model.addAttribute("password",password);
	    
	    
	    return "success"; // success.jsp
	}
}
	