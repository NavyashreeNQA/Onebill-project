package com.onebill.billingapp.dto;

import java.io.Serializable;

import lombok.Data;
@Data
public class Charges implements Serializable {
	private int chargeId;
	private String chargeType;
	private String chargeFor;
	private double charge;
}
