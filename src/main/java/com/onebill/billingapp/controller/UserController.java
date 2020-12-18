package com.onebill.billingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onebill.billingapp.dto.ResponseDTO;
import com.onebill.billingapp.entities.Addon;
import com.onebill.billingapp.entities.Charges;
import com.onebill.billingapp.entities.Plan;
import com.onebill.billingapp.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/plan")
	public ResponseDTO buyPlan(Plan plan) {
		ResponseDTO response=new ResponseDTO();
		response.setData(userService.buyPlan(plan));
		return response;
	}
	
	@PutMapping("/manage-plan")
	public ResponseDTO renewPlans(@RequestBody Plan plan) {
		ResponseDTO response=new ResponseDTO();
		response.setData(userService.renewPlan(plan));
		return response;
	}
	
	@GetMapping("/plans")
	public ResponseDTO getAllPlans() {
		ResponseDTO response=new ResponseDTO();
		response.setData(userService.getAllPlans());
		return response;
	}
	
	@PostMapping("/addon")
	public ResponseDTO fillAddon(Addon addon) {
		ResponseDTO response=new ResponseDTO();
		response.setData(userService.fillAddon(addon));
		return response;

	}
	
	@GetMapping("/charges")
	public ResponseDTO viewAllCharge(Charges charges) {
		ResponseDTO response=new ResponseDTO();
		response.setData(userService.viewAllCharge(charges));
		return response;

	}

}
