package com.onebill.billingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onebill.billingapp.dto.ResponseDTO;
import com.onebill.billingapp.entities.Charges;
import com.onebill.billingapp.entities.Company;
import com.onebill.billingapp.entities.Plan;
import com.onebill.billingapp.entities.PlanDetails;
import com.onebill.billingapp.entities.Services;
import com.onebill.billingapp.service.CompanyService;

@RestController
@RequestMapping("/company")
public class CompanyController {
	@Autowired
	private CompanyService companyService;
	
	@PostMapping("/product")
	public ResponseDTO addCompany(@RequestBody Company company) {
		ResponseDTO response=new ResponseDTO();
		response.setData(companyService.addCompany(company));
		return response;
	}
	
	@PostMapping("/service")
	public ResponseDTO addService(@RequestBody Services service) {
		ResponseDTO response=new ResponseDTO();
		response.setData(companyService.addService(service));
		return response;
	}
	
	@DeleteMapping("/service/{serviceId}")
	public ResponseDTO deleteService(@PathVariable int serviceId) {
		ResponseDTO response=new ResponseDTO();
		response.setData(companyService.deleteService(serviceId));
		return response;
	}
	
	@PostMapping("/plan")
	public ResponseDTO addPlan(@RequestBody Plan plan) {
		ResponseDTO response=new ResponseDTO();
		response.setData(companyService.addPlan(plan));
		return response;
	}
	
	@PutMapping("/manage-plan")
	public ResponseDTO updatePlan(@RequestBody Plan plan) {
		ResponseDTO response=new ResponseDTO();
		response.setData(companyService.updatePlan(plan));
		return response;
	}
	
	@GetMapping("/plans")
	public ResponseDTO getAllPlan() {
		ResponseDTO response=new ResponseDTO();
		response.setData(companyService.getAllPlan());
		return response;
	}
	
	@DeleteMapping("/plan/{planId}")
	public ResponseDTO removePlan(@PathVariable int planId) {
		ResponseDTO response=new ResponseDTO();
		response.setData(companyService.removePlan(planId));
		return response;
	}
	
	@PostMapping("/bundle")
	public ResponseDTO createBundle(@RequestBody PlanDetails details) {
		ResponseDTO response=new ResponseDTO();
		response.setData(companyService.createBundle(details));
		return response;
	}
	
	@GetMapping("/bundles")
	public ResponseDTO getAllBundles() {
		ResponseDTO response=new ResponseDTO();
		response.setData(companyService.getAllBundles());
		return response;
	}
	
	@PostMapping("/charge")
	public ResponseDTO addCharges(@RequestBody Charges charges) {
		ResponseDTO response=new ResponseDTO();
		response.setData(companyService.addCharges(charges));
		return response;
	}
	
	@PutMapping("/manage-charges")
	public ResponseDTO updateCharges(@RequestBody Charges charges) {
		ResponseDTO response=new ResponseDTO();
		response.setData(companyService.updateCharges(charges));
		return response;
	}
	
	@PutMapping("/manage-bundle")
	public ResponseDTO updateBundle(@RequestBody PlanDetails details) {
		ResponseDTO response=new ResponseDTO();
		response.setData(companyService.updateBundle(details));
		return response;
	}
	
	@DeleteMapping("/bundle/{planDetailId}")
	public ResponseDTO deleteBundle(@PathVariable int planDetailId) {
		ResponseDTO response=new ResponseDTO();
		response.setData(companyService.deleteBundle(planDetailId));
		return response;
	}
}
