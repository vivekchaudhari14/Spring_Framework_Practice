package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springmvc.entities.User;

@Controller
public class ContactController {
	
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("header","LearnWithMe");
		m.addAttribute("desc","For Programmer");
	}
	
	@RequestMapping("/montact")
	public String contact() {
		return "contact";
	}
	
	@RequestMapping(path="/processform", method=RequestMethod.POST)
	public String handleForm( @ModelAttribute User user, Model model) {
	    return "success"; // success.jsp
	}
}
	

/*
 * @RequestMapping(path="/processform", method=RequestMethod.POST) public String
 * handleForm(
 * 
 * @RequestParam("name") String name,
 * 
 * @RequestParam("mob") String mob,
 * 
 * @RequestParam("email") String email,
 * 
 * @RequestParam("password") String password, Model model) {
 * 
 * System.out.println("Name: " + name); System.out.println("Mobile: " + mob);
 * System.out.println("Email: " + email); System.out.println("Password: " +
 * password);
 * 
 * model.addAttribute("name",name); model.addAttribute("mob",mob);
 * model.addAttribute("email",email); model.addAttribute("password",password);
 * 
 * User user = new User(); user.setName(name); user.setMob(mob);
 * user.setEmail(email); user.setPassword(password);
 * 
 * model.addAttribute(user); return "success"; // success.jsp
 */