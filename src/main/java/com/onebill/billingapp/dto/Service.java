package com.onebill.billingapp.dto;

import java.io.Serializable;

import lombok.Data;
@SuppressWarnings("serial")
@Data
public class Service implements Serializable{
	private int serviceId;
	private String serviceType;
	private String serviceName;
	
}
