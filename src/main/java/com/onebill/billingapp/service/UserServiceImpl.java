package com.onebill.billingapp.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.onebill.billingapp.dao.UserDao;
import com.onebill.billingapp.entities.Addon;
import com.onebill.billingapp.entities.Charges;
import com.onebill.billingapp.entities.Plan;
import com.onebill.billingapp.exception.BillingAppException;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserDao userDao;
	public Plan buyPlan(Plan plan) {
		Plan buyPlan=userDao.buyPlan(plan);
		if(buyPlan!=null) {
			return buyPlan;
		}else {
			throw new BillingAppException("Unable to buy a plan");
		}
	}

	public Plan renewPlan(Plan plan) {
		Plan renewPlan=userDao.buyPlan(plan);
		if(renewPlan!=null) {
			return renewPlan;
		} else {
			throw new BillingAppException("Unable to renew plan");
		}
	}

	public List<Plan> getAllPlans() {
		List<Plan> viewAllPlans = userDao.getAllPlans();
		if(viewAllPlans!=null) {
			return viewAllPlans;
		} else {
			throw new BillingAppException("Unable to fetch all plans");
		}
	}

	public Addon fillAddon(Addon addon) {
		Addon fillAddon=userDao.fillAddon(addon);
		if(fillAddon!=null) {
			return fillAddon;
		} else {
			throw new BillingAppException("Unable to fill addon");
		}
	}

	public List<Charges> viewAllCharge(Charges charges) {
		 List<Charges> viewAllCharge = userDao.viewAllCharge(charges);
		if(viewAllCharge!=null) {
			return viewAllCharge;
		} else {
			throw new BillingAppException("Unable to fetch all charges");
		}
	}

}
