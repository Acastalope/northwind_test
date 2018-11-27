package com.PracticeNorthwind.pracnorthwind.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customers {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "City")
	private String customerCity;
	
	@Column(name = "CompanyName")
	private String companyName;
	
	@Column(name = "ContactName")
	private String contactName;

	
	public Customers () {
	
	}
	@Override
	public String toString() {
		return "Customers [customerCity=" + customerCity + ", companyName=" + companyName + ", contactName="
				+ contactName + "]";
	}
	
	
	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public Customers(String customerCity, String companyName, String contactName) {
		super();
		this.customerCity = customerCity;
		this.companyName = companyName;
		this.contactName = contactName;
	}

}