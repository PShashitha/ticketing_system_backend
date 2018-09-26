package com.csse.cssebackend.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "account")

public class Account {
	@Id
	private String id;
	
	
	private String acccNO;
	private String phoneNumber;
	private double amount;
	private String name;
	private String email;
	private int expYear;


	public String getId() {
		return id;
	}
	
	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the acccNO
	 */
	public String getAcccNO() {
		return acccNO;
	}

	/**
	 * @param acccNO the acccNO to set
	 */
	public void setAcccNO(String acccNO) {
		this.acccNO = acccNO;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the expYear
	 */
	public int getExpYear() {
		return expYear;
	}

	/**
	 * @param expYear the expYear to set
	 */
	public void setExpYear(int expYear) {
		this.expYear = expYear;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	
}
