package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseForm;
import com.rays.dto.FollowUpDTO;

public class FollowUpForm extends BaseForm {

	@NotEmpty(message = "Please enter patient name")
	private String patient;

	@NotEmpty(message = "Please enter doctor name")
	private String doctor;

	@NotNull(message = "Please enter date of birth")
	private Date dob;

	@NotEmpty(message = "Please enter fees")
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

	// DTO Mapping

	@Override
	public FollowUpDTO getDto() {
		FollowUpDTO dto = initDTO(new FollowUpDTO());
		dto.setPatient(patient);
		dto.setDoctor(doctor);
		dto.setDob(dob);
		dto.setFees(fees);
		return dto;
	}
}