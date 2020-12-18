package com.onebill.billingapp.dto;

import java.io.Serializable;

import lombok.Data;
@SuppressWarnings("serial")
@Data
public class PlanDetails implements Serializable {
	private int planDetailId;
	private String planType;
	private String details;

}
