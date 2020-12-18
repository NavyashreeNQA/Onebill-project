package com.onebill.billingapp.dto;

import java.io.Serializable;

import lombok.Data;
@SuppressWarnings("serial")
@Data
public class Company implements Serializable {
	private int companyId;
	private String companyName;
	private String companyEmail;
	private String companyPwd;
}
