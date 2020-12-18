package com.onebill.billingapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.onebill.billingapp.dao.CompanyDao;
import com.onebill.billingapp.entities.Charges;
import com.onebill.billingapp.entities.Company;
import com.onebill.billingapp.entities.Plan;
import com.onebill.billingapp.entities.PlanDetails;
import com.onebill.billingapp.entities.Services;
import com.onebill.billingapp.exception.BillingAppException;

@Service

public class CompanyServiceImpl implements CompanyService{
	@Autowired
	CompanyDao companyDao;
	
	
	public Services addService(Services service) {
		Services addService = companyDao.addService(service);
		if(addService!=null) {
			return addService;
		} else {
			throw new BillingAppException("Unable to add service");
		} 
	}
	
	
	public Services deleteService(int serviceId) {
		Services deleteService=companyDao.deleteService(serviceId);
		if(deleteService!=null) {
			return deleteService;
		} else {
			throw new BillingAppException("Unable to delete service");
		}
	}
	
	
	public Plan addPlan(Plan plan) {
		Plan addPlan=companyDao.addPlan(plan);
		if(addPlan!=null) {
			return addPlan;
		} else {
			throw new BillingAppException("Unable to add plan");
		}
	}
	
	
	public Plan updatePlan(Plan plan) {
		Plan updatePlan=companyDao.updatePlan(plan);
		if(updatePlan!=null) {
			return updatePlan;
		} else {
			throw new BillingAppException("Unable to update plan");
		}
	}
	
	
	public List<Plan> getAllPlan() {
		List<Plan> getAllPlan = companyDao.getAllPlan();
		if(getAllPlan!=null) {
			return getAllPlan;
		} else {
			throw new BillingAppException("Unable to fetch all plans");
		}
	}
	
	
	public Plan removePlan(int planId) {
		Plan removePlan=companyDao.removePlan(planId);
		if(removePlan!=null) {
			return removePlan;
		} else {
			throw new BillingAppException("Unable to remove plan");
		}
	}
	
	
	public PlanDetails createBundle(PlanDetails details) {
		PlanDetails createBundle=companyDao.createBundle(details);
		if(createBundle!=null) {
			return createBundle;
		} else {
			throw new BillingAppException("Unable to create bundle");
		}
	}
	
	
	public Charges addCharges(Charges charges) {
		Charges addCharges=companyDao.addCharges(charges);
		if(addCharges!=null) {
			return addCharges;
		} else {
			throw new BillingAppException("Unable to add charges");
		}
	}

	
	public Charges updateCharges(Charges charges) {
		Charges updateCharges=companyDao.updateCharges(charges);
		if(updateCharges!=null) {
			return updateCharges;
		} else {
			throw new BillingAppException("Unable to update charge");
		}
	}

	public Company addCompany(Company company) {
		Company addCompany = companyDao.addCompany(company);
		if(addCompany!=null) {
			return addCompany;
		} else {
			throw new BillingAppException("Unable to add company");
		}
	}


	
	public List<PlanDetails> getAllBundles() {
		List<PlanDetails> getAllBundles = companyDao.getAllBundles();
		if(getAllBundles!=null) {
			return getAllBundles;
		} else {
			throw new BillingAppException("Unable to fetch all bundles");
		}
	}


	
	public PlanDetails updateBundle(PlanDetails details) {
		PlanDetails updateBundle=companyDao.updateBundles(details);
		if(updateBundle!=null) {
			return updateBundle;
		} else {
			throw new BillingAppException("Unable to update bundle");
		}
	}


	public PlanDetails deleteBundle(int planDetailId) {
		PlanDetails deleteBundle=companyDao.deleteBundle(planDetailId);
		if(deleteBundle!=null) {
			return deleteBundle;
		} else {
			throw new BillingAppException("Unable to remove bundle");
		}
	}

}
