package com.csse.cssebackend.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "travel")
public class Journey {
	
	@Id
	private String jnyID;
	private String jnyStart;
	private String jnyDestination;
	private double factor;
	private double fee;
	private String phoneNumber;


	public String getJnyID() {
		return jnyID;
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
	 * @return the fee
	 */
	public double getFee() {
		return fee;
	}

	/**
	 * @param fee the fee to set
	 */
	public void setFee(double fee) {
		this.fee = fee;
	}

	/**
	 * @return the factor
	 */
	public double getFactor() {
		return factor;
	}

	/**
	 * @param factor the factor to set
	 */
	public void setFactor(double factor) {
		this.factor = factor;
	}

	/**
	 * @return the jnyDestination
	 */
	public String getJnyDestination() {
		return jnyDestination;
	}

	/**
	 * @param jnyDestination the jnyDestination to set
	 */
	public void setJnyDestination(String jnyDestination) {
		this.jnyDestination = jnyDestination;
	}

	public void setJnyID(String jnyID) {
		this.jnyID = jnyID;
	}

	/**
	 * @return the jnyStart
	 */
	public String getJnyStart() {
		return jnyStart;
	}

	/**
	 * @param jnyStart the jnyStart to set
	 */
	public void setJnyStart(String jnyStart) {
		this.jnyStart = jnyStart;
	}
	
	
	
	
}
