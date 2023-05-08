package com.traction11.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.traction11.Repository.LeadRepository;
import com.traction11.entities.Lead;

@Service
public class LeadServiceimpl implements LeadService {

	@Autowired
	private LeadRepository leadRepo;
	
	@Override
	public void savedLead(Lead lead) {
		leadRepo.save(lead);
	}
	@Override
	public List<Lead> getLeads() {
		List<Lead> leads = leadRepo.findAll();
		return leads;
	}
	@Override
	public void deleteLead(long id) {
		leadRepo.deleteById(id);
	}
	@Override
	public Lead findOneLead(long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		Lead lead = findById.get();
	   return lead;
	}
	}


