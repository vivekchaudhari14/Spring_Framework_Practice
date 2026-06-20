package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String getModel(Model model) {
		System.out.println("This is home url");
		model.addAttribute("name", "Vivek");
		model.addAttribute("id",55);
		List<String> friends = new ArrayList<String>();
		friends.add("vivek");
		friends.add("Harshal");
		friends.add("mayur");
		friends.add("Uday");
		model.addAttribute("friends",friends);
		return "index";
	}
	
	@RequestMapping("/")
    public String home() {
        return "index";
    }
    
    @RequestMapping("/about")
    public String about() {
    	return "about";
    }
}