package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
    
    @RequestMapping("/help")
    public ModelAndView help() {
    	// Create ModelView Class Obj
    	ModelAndView modelAndView = new ModelAndView();
    	System.out.println("This created by help purpose");
    	//Setting Data
    	modelAndView.addObject("name","Vivek");
    	modelAndView.addObject("id",2546);
    	LocalDateTime now = LocalDateTime.now();
    	modelAndView.addObject("time",now);
    	
    	// list 
    	List<Integer> marks = new  ArrayList<Integer>();
    	marks.add(55);
    	marks.add(47);
    	marks.add(45);
    	
    	modelAndView.addObject("marks",marks);
    	//Stetting View
    	modelAndView.setViewName("help");
    	
    	return modelAndView;
    }
    
}