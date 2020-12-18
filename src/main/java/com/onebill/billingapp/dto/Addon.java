package com.onebill.billingapp.dto;

import java.io.Serializable;

import lombok.Data;
@SuppressWarnings("serial")
@Data
public class Addon implements Serializable {
	private int addonId;
	private int documentId;
	private String documentType;
	private String documents;
}
