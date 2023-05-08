package com.traction11.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.traction11.dto.LeadData;
import com.traction11.entities.Lead;
import com.traction11.services.LeadService;
import com.traction11.utility.EmailService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadservice;
	
	@Autowired
	private EmailService emailservice;
	
@RequestMapping("/saveFrontEndPage")
	public String saveFrontEndPAge() {
		return"fresh_lead";
	}
@RequestMapping("/savedLead")
public String savedOneLead(@ModelAttribute Lead lead, ModelMap model) {
	leadservice.savedLead(lead);
	emailservice.sendSimpleMessage("varunkumarkm44@gmail.com", "Test", "Lead is saved!!");
	model.addAttribute("msg", "Lead Is Saved");
	return"fresh_lead";
   }
@RequestMapping("/listall")
public String listAll(ModelMap model) {
	List<Lead> leads = leadservice.getLeads();
	model.addAttribute("leads",leads);
	return "lead_search_result";
  }
@RequestMapping("/delete")
public String deleteOneLead(@RequestParam("id")long id,ModelMap model) {
	leadservice.deleteLead(id);
	List<Lead> leads = leadservice.getLeads();
	model.addAttribute("leads",leads);
	return "lead_search_result";
  }
@RequestMapping("/update")
public String updateOneLead(@RequestParam("id")long id,ModelMap model) {
	Lead lead = leadservice.findOneLead(id);
	model.addAttribute("lead",lead);
	return"update_lead";
  }
@RequestMapping("/updateLead")
public String updateLead(LeadData lead,ModelMap model) {
	Lead l = new Lead();
	l.setId(lead.getId());
	l.setFirstName(lead.getFirstName());
	l.setLastName(lead.getLastName());
	l.setEmail(lead.getEmail());
	l.setMobile(lead.getMobile());
	leadservice.savedLead(l);	
	model.addAttribute("msg", "Lead Is updated");
	List<Lead> leads = leadservice.getLeads();
	model.addAttribute("leads",leads);
	return "lead_search_result";
  }
}







