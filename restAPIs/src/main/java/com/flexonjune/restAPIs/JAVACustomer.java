package com.flexonjune.restAPIs;

public class JAVACustomer {
	
	private int customerID;
	private String name;
	private String lastname;
	private int phoneNumber;
	
	public JAVACustomer(int custID, String name, String lastname, int phoneNumber) {
		super();
		this.customerID = custID;
		this.name = name;
		this.lastname = lastname;
		this.phoneNumber = phoneNumber;
	}
	
	public int getCustID() {
		return customerID;
	}
	public void setCustID(int custID) {
		this.customerID = custID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		return "JAVACustomer [customerID=" + customerID + ", name=" + name + ", lastname=" + lastname + ", phoneNumber="
				+ phoneNumber + "]";
	}

	

	
}
