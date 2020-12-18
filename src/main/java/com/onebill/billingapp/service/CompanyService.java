package com.onebill.billingapp.service;

import java.util.List;

import com.onebill.billingapp.entities.Charges;
import com.onebill.billingapp.entities.Company;
import com.onebill.billingapp.entities.Plan;
import com.onebill.billingapp.entities.PlanDetails;
import com.onebill.billingapp.entities.Services;

public interface CompanyService {
	public Company addCompany(Company company);
	
	public Services addService(Services service);
	
	public Services deleteService(int serviceId);
	
	public Plan addPlan(Plan plan);
	
	public Plan updatePlan(Plan plan);
	
	public List<Plan> getAllPlan();
	
	public Plan removePlan(int planId);
	
	public PlanDetails createBundle(PlanDetails details);
	
	public List<PlanDetails> getAllBundles();
	
	public PlanDetails updateBundle(PlanDetails details);
	
	public PlanDetails deleteBundle(int planDetailId);
	
	public Charges addCharges(Charges charges);
	
	public Charges updateCharges(Charges charges);

}
