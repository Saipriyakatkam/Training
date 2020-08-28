package com.pojo;

import java.io.Serializable;

public class Address implements Serializable {

	 private String city;
	 private String State;
	 private String pincode;
	 public Address()
	 {
		 
	 }
	public Address(String city, String state, String pincode) {
		super();
		this.city = city;
		State = state;
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", State=" + State + ", pincode=" + pincode + "]";
	}
	 
	

}
