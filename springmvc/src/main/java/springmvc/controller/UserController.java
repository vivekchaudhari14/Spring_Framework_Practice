package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.entities.User;
import springmvc.service.UserService;

@Controller
public class UserController {
	
		@Autowired
	    private UserService userService;

	    @RequestMapping("/userData")
	    public String userHelp() {
	        return "contact";
	    }

	    @RequestMapping(path="/processform1", method=RequestMethod.POST)
	    public String userHelper(@ModelAttribute("user") User user, Model model) {

	        int id = userService.createUser(user);

	        model.addAttribute("msg", "User saved successfully with id " + id);

	        return "success";
	    }
}
