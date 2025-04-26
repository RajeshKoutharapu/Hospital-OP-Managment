package com.OpManagment.Hospital_Op_Managment.webLayer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.OpManagment.Hospital_Op_Managment.Dao.WardRepository;
import com.OpManagment.Hospital_Op_Managment.Dao.Word;

@Controller
@RequestMapping("/ward")
public class WardController {

    @Autowired
    private WardRepository wardRepo;

    @GetMapping
    public String viewWards(Model model) {
        model.addAttribute("wards", wardRepo.findAll());
        return "wardList";
    }

    @GetMapping("/add")
    public String addWardForm(Model model) {
        model.addAttribute("ward", new Word());
        return "addWard";
    }

    @PostMapping("/save")
    public String saveWard(@ModelAttribute("ward") Word ward) {
        wardRepo.save(ward);
        return "redirect:/ward";
    }
}
