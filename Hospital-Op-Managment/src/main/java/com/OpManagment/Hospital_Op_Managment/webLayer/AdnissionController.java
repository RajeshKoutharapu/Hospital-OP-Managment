package com.OpManagment.Hospital_Op_Managment.webLayer;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.OpManagment.Hospital_Op_Managment.Dao.Admission;
import com.OpManagment.Hospital_Op_Managment.Dao.AdmissionRepository;
import com.OpManagment.Hospital_Op_Managment.Dao.EntityClass;
import com.OpManagment.Hospital_Op_Managment.Dao.Repointerface;
import com.OpManagment.Hospital_Op_Managment.Dao.WardRepository;
import com.OpManagment.Hospital_Op_Managment.Dao.Word;
import com.OpManagment.Hospital_Op_Managment.serviceLayer.WardService;

import org.springframework.ui.Model;

@Controller
public class AdnissionController {
	 @Autowired
	    private Repointerface patientService;

	    @Autowired
	    private WardService wardService;
	    
	    @Autowired
	    AdmissionRepository adminrepo;

	    @PostMapping("/admit")
	    public String admitPatient(@RequestParam("patientId") Integer patientId,
	                               @RequestParam("wardId") String wardId,
	                               @RequestParam("bedNumber") Integer bedNumber, Model model) {
	        // Find patient by ID
	        EntityClass patient = patientService.findById(patientId).get();
	        if (patient == null) {
	            model.addAttribute("error", "Patient not found!");
	            return "errorPage"; // You can redirect or show an error page here.
	        }

	        // Find ward by ID
	        Word ward = wardService.findWardById(wardId);
	        if (ward == null) {
	            model.addAttribute("error", "Ward not found!");
	            return "errorPage"; // You can redirect or show an error page here.
	        }

	        // Check if the bed is available
	        if (ward.getAvailableBeds() > 0) {
	            // Update ward: increase occupied beds by 1
	            ward.setOccupiedBeds(ward.getOccupiedBeds() + 1);
	            wardService.saveWard(ward);

	            // Optionally, create an admission record (new table or log)
	            Admission admission = new Admission(patient, ward, bedNumber);
	            adminrepo.save(admission);

	            model.addAttribute("message", "Patient admitted successfully!");
	            return "admissionSuccessPage"; // Redirect to a success page or show success message.
	        } else {
	            model.addAttribute("error", "No available beds in this ward.");
	            return "errorPage"; // Show an error page or a suitable message.
	        }
	    }
}
