package com.aprisma.devops.testing;

public class Customer {
	private String name;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int sum(int a, int b){
		int hasil = a+b;
		return hasil;
	}
	
}
