package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseForm;
import com.rays.dto.CompensationDTO;

public class CompensationForm extends BaseForm {

	@NotEmpty(message = "please enter Staff Member")
	@Pattern(regexp = "^[A-Za-z ]+$", message = "Only letters are allowed")
	private String staffMember;

	@NotNull(message = "please enter Payment Amount")
	private Integer paymentAmount;

	@NotNull(message = "please enter Date Applied")
	private Date dateApplied;

	@NotEmpty(message = "please enter State")
	private String state;

	public String getStaffMember() {
		return staffMember;
	}

	public void setStaffMember(String staffMember) {
		this.staffMember = staffMember;
	}

	public Integer getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(Integer paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public Date getDateApplied() {
		return dateApplied;
	}

	public void setDateApplied(Date dateApplied) {
		this.dateApplied = dateApplied;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public CompensationDTO getDto() {

		CompensationDTO dto = initDTO(new CompensationDTO());
		dto.setStaffMember(staffMember);
		dto.setPaymentAmount(paymentAmount);
		dto.setDateApplied(dateApplied);
		dto.setState(state);
		return dto;
	}
}