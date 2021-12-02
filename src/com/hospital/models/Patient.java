package com.hospital.models;

import java.util.Date;

import com.hospital.enumerations.InsuranceType;

public class Patient extends Person{

	private Date hospitalEntryDate;
	private String affiliationNumber;
	private InsuranceType insuranceType;
	private double wallet;
	
	public Patient(String firstname,String lastname,String phone,String address,Date hospitalEntryDate,String affiliationNumber,InsuranceType insuranceType,double wallet) {
		super(firstname,lastname,phone,address);
		this.hospitalEntryDate = hospitalEntryDate;
		this.affiliationNumber = affiliationNumber;
		this.insuranceType = insuranceType;
		this.wallet = wallet;
	}

	public Date getHospitalEntryDate() {
		return hospitalEntryDate;
	}

	public void setHospitalEntryDate(Date hospitalEntryDate) {
		this.hospitalEntryDate = hospitalEntryDate;
	}

	public String getAffiliationNumber() {
		return affiliationNumber;
	}

	public void setAffiliationNumber(String affiliationNumber) {
		this.affiliationNumber = affiliationNumber;
	}

	public InsuranceType getInsuranceType() {
		return insuranceType;
	}

	public void setInsuranceType(InsuranceType insuranceType) {
		this.insuranceType = insuranceType;
	}

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }


	public void addToWallet(double amount) {
		this.wallet += amount;
	}

	@Override
	public String toString() {
		return "Patient [hospitalEntryDate=" + hospitalEntryDate + ", affiliationNumber=" + affiliationNumber
				+ ", insuranceType=" + insuranceType + "]";
	}	
}
