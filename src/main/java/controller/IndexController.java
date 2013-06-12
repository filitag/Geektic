package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import service.GeekService;

@Controller
@RequestMapping("/")
public class IndexController {
	
	@Autowired
	private GeekService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public String index() {
		
		return "index";
	}

}
