package com.csse.cssebackend.model;

import java.util.Date;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "PassengerJourney")
public class PassengerJourney {
	
	@Id
	private String pasJnyID;
	
	private String busNo;
	private int phoneNumber;
	private String date;
	private double amount;
	private String accNo;
	
	public String getPasJnyID() {
		return pasJnyID;
	}
	
	/**
	 * @return the accNo
	 */
	public String getAccNo() {
		return accNo;
	}

	/**
	 * @param accNo the accNo to set
	 */
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @return the busNo
	 */
	public String getBusNo() {
		return busNo;
	}

	/**
	 * @param busNo the busNo to set
	 */
	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}

	/**
	 * @return the phoneNumber
	 */
	public int getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setPasJnyID(String pasJnyID) {
		this.pasJnyID = pasJnyID;
	}
	
	
}
