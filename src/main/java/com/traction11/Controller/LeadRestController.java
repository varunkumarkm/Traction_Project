package com.traction11.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.traction11.Repository.LeadRepository;
import com.traction11.entities.Lead;

@RestController
public class LeadRestController {
	
	@Autowired
	private LeadRepository leadRepo;
	
    @GetMapping("/listallleads")
	public List<Lead> getAllLeads(){
		List<Lead> leads = leadRepo.findAll();
		return leads;
	}
    @PostMapping("/saveApi")
    public void saveLead(@RequestBody Lead lead) {
    	leadRepo.save(lead);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteLead(@PathVariable long id) {
    	leadRepo.deleteById(id);
  }
    @PutMapping("/updateApi")
    public void updateLead(@RequestBody Lead lead) {
    	leadRepo.save(lead);
    }
    
}