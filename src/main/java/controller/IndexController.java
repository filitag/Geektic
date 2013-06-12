package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import service.GeekService;

@Controller
@RequestMapping("/")
public class IndexController {
	
	@Autowired
	private GeekService srv;
	
	@RequestMapping(method=RequestMethod.GET)
	public String index() {
		
		return "index";
	}
	
	@RequestMapping(value="/profilsGeek",method = RequestMethod.GET)
	public String list(ModelMap model) {
		model.addAttribute("listeGeek",srv.list());
		return ("profilsGeek");
	}
	
}
