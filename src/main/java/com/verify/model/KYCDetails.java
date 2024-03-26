package com.verify.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="verifyPan")
public class KYCDetails {
	
	@Id
	private String panNumber;
    private String fullName;
    private String fatherName;
    private String dob;
    
    
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	@Override
	public String toString() {
		return "KYCDetails [panNumber=" + panNumber + ", fullName=" + fullName + ", fatherName=" + fatherName + ", dob="
				+ dob + "]";
	}
	public KYCDetails() {
		super();
	}
	public KYCDetails(String panNumber, String fullName, String fatherName, String dob) {
		super();
		this.panNumber = panNumber;
		this.fullName = fullName;
		this.fatherName = fatherName;
		this.dob = dob;
	}
    
    

}
