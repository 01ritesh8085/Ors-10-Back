package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.SupplierDTO;

public class SupplierForm extends BaseForm{

	@NotEmpty(message = "please enter name")
	private String name;

	@NotEmpty(message = "please enter category")
	private String category;

	@NotNull(message = "please enter dob")
	private Date dob;

	@NotNull(message = "please enter paymant term")
	private Long paymantTerm;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Long getPaymantTerm() {
		return paymantTerm;
	}

	public void setPaymantTerm(Long paymantTerm) {
		this.paymantTerm = paymantTerm;
	}
	@Override
	public BaseDTO getDto() {

		SupplierDTO dto = initDTO(new SupplierDTO());
		dto.setName(name);
		dto.setCategory(category);
		dto.setDob(dob);
		dto.setPaymantTerm(paymantTerm);		
		return dto;
	}
}
