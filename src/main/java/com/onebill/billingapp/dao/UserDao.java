package com.onebill.billingapp.dao;

import java.util.List;

import com.onebill.billingapp.entities.Plan;
import com.onebill.billingapp.entities.Addon;
import com.onebill.billingapp.entities.Charges;

public interface UserDao {
	public Plan buyPlan(Plan plan);
	
	public Plan renewPlan(Plan plan);
	
	public List<Plan> getAllPlans();
	
	public Addon fillAddon(Addon addon);
	
	public List<Charges> viewAllCharge(Charges charges);
}
