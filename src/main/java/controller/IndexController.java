package controller;

import java.util.ArrayList;
import java.util.List;

import model.Spectacle;
import model.TypeDeSpectacle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import service.SpectacleService;

@Controller
@RequestMapping("/")
public class IndexController {
	
	@Autowired
	private SpectacleService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public String index() {
		
		return "index";
	}

}
