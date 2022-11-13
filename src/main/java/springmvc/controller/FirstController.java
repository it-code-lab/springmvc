package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {
	
	@RequestMapping("/")
	public String displayHomeForDefault(ModelMap  model) {
		model.addAttribute("message", "Welcome Home");
		return "home";
	}
	
	@RequestMapping("/home")
	public String displayHome(ModelMap  model) {
		model.addAttribute("message", "Welcome Home");
		return "home";
	}

	@RequestMapping("/about")
	public String displayAbout(ModelMap model) {
		model.addAttribute("message", "This page is to provide some information about our company");
		return "about";
	}

	@RequestMapping("/help")
	public String displayHelp(ModelMap model) {
		model.addAttribute("message", "This page is to provide help document");
		return "help";
	}
}