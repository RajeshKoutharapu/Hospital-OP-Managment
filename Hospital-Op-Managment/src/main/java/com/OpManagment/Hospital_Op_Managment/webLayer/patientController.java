package com.OpManagment.Hospital_Op_Managment.webLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.OpManagment.Hospital_Op_Managment.Dao.EntityClass;

@Controller
public class patientController {
	@Autowired
	Sender sender;
	@GetMapping("/checker")
public String getpatient(Model model, @RequestParam("pname") String check) {

	List<EntityClass> list=sender.getDetails(check);

if(list.size()>0) {
	model.addAttribute("details",list);
	}else
	model.addAttribute("res","invalid record");
	
	return"Details";
	
}
}
