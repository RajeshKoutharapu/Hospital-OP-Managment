package com.OpManagment.Hospital_Op_Managment.webLayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class MainpageController {
	@Autowired
	Sender sender;
	
	@GetMapping("/main")
public String mainpage() {
	return "Mainpage";
}
	@PostMapping("/register")
	public String getRigester(Model model ,@ModelAttribute("detailbean") rigesterDetails detailbean)
	{
		model.addAttribute("msg",detailbean);
		sender.send(detailbean);
		return"review";
	}
	
}
