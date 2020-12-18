package com.onebill.billingapp.dto;

import java.io.Serializable;

import lombok.Data;
@SuppressWarnings("serial")
@Data
public class Plan implements Serializable{
	private int planId;
	private String planType;
	private String planName;
	private String planValidity;
	private String data;
	private double amount;
}
