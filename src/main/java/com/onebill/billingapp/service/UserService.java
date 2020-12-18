package com.onebill.billingapp.service;

import java.util.List;

import com.onebill.billingapp.entities.Addon;
import com.onebill.billingapp.entities.Charges;
import com.onebill.billingapp.entities.Plan;

public interface UserService {
	public Plan buyPlan(Plan plan);

	public Plan renewPlan(Plan plan);

	public List<Plan> getAllPlans();

	public Addon fillAddon(Addon addon);

	public List<Charges> viewAllCharge(Charges charges);
}
