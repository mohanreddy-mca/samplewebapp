package com.cmr.springboot.demo.pojo;

import com.owlike.genson.annotation.JsonProperty;

public class Customer {

	private String customerId;
	
	private String CUSTOMER_NAME;
	
	private String CUSTOMERADDR;

	//@JsonProperty("CUSTOMERID")
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	
	public String getCUSTOMER_NAME() {
		return CUSTOMER_NAME;
	}

	public void setCUSTOMER_NAME(String cUSTOMER_NAME) {
		CUSTOMER_NAME = cUSTOMER_NAME;
	}

	@JsonProperty("CUSTOMERADDR")
	public String getCUSTOMERADDR() {
		return CUSTOMERADDR;
	}

	public void setCUSTOMERADDR(String cUSTOMERADDR) {
		CUSTOMERADDR = cUSTOMERADDR;
	}

	
	
}
