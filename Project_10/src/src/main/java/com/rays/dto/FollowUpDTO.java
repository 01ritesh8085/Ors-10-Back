package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_FOLLOWUP")
public class FollowUpDTO extends BaseDTO {

	@Column(name = "PATIENT", length = 50)
	private String patient;

	@Column(name = "DOCTOR", length = 50)
	private String doctor;

	@Column(name = "DOB")
	private Date dob;

	@Column(name = "FEES")
	private String fees;

	// Getter Setter

	public String getPatient() {
		return patient;
	}

	public void setPatient(String patient) {
		this.patient = patient;
	}

	public String getDoctor() {
		return doctor;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getFees() {
		return fees;
	}

	public void setFees(String fees) {
		this.fees = fees;
	}

	// BaseDTO methods

	@Override
	public String getValue() {
		return patient;
	}

	@Override
	public String getUniqueKey() {
		return "patient";
	}

	@Override
	public String getUniqueValue() {
		return patient;
	}

	@Override
	public String getLabel() {
		return "FollowUp";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		map.put("patient", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<>();
		map.put("patient", patient);
		return map;
	}
}