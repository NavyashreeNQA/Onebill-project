package com.onebill.billingapp.dto;

import java.io.Serializable;

import lombok.Data;
@SuppressWarnings("serial")
@Data
public class User implements Serializable {
	private int userId;
	private String username;
	private String userEmail;
	private long userPhno;
	private String userAdress;
}
