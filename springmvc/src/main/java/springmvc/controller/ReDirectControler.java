package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReDirectControler {
	
	@RequestMapping("/about1")
	public RedirectView ab() {
		
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("second");
		return redirectView;
		
		
	}
	
	@RequestMapping("/second")
	public String sec() {
		System.out.println("This is Second One");
		return "";
	}
}
