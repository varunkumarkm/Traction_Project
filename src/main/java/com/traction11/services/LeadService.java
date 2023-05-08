package com.traction11.services;

import java.util.List;

import com.traction11.entities.Lead;

public interface LeadService {

	public void savedLead(Lead lead);
	public List<Lead> getLeads();
	public void deleteLead(long id);
	public Lead findOneLead(long id);

}