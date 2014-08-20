package com.example.feirafacil.system;

public class Address {
	private int number;
	private String road;
	private String neighborhood;
	private String city;
	private String phoneNumber;
	
	public Address(int number, String road, String neighborhood, String city, String phoneNumber) {
		this.number = number;
		this.road = road;
		this.neighborhood = neighborhood;
		this.city = city;
		this.phoneNumber = phoneNumber;
	}

	/**
	 * Get number
	 * @return
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * Get road
	 * @return
	 */
	public String getRoad() {
		return road;
	}

	/**
	 * Get neighborhood
	 * @return
	 */
	public String getNeighborhood() {
		return neighborhood;
	}

	/**
	 * Get city
	 * @return
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Get phone number
	 * @return
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
}
