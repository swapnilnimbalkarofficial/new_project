package com.demo.model;

public class Customer {

	private int customerId;
	private String name;
	private long phone;
	private long aadhar;
	public Customer(int customerId, String name, long l, long m) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.phone = l;
		this.aadhar = m;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", phone=" + phone + ", aadhar=" + aadhar
				+ "]";
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public long getAadhar() {
		return aadhar;
	}
	public void setAadhar(int aadhar) {
		this.aadhar = aadhar;
	}
}
