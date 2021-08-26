package com.sairajmaven.CrudHibernate;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	private String state;
	private String sector;
	private String street;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Address [state=" + state + ", sector=" + sector + ", street=" + street + "]";
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Address(String state, String sector, String street) {
		super();
		this.state = state;
		this.sector = sector;
		this.street = street;
	}


	
	
	
}
