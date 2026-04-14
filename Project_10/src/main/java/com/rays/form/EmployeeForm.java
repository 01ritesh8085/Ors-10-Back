package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.EmployeeDTO;

public class EmployeeForm extends BaseForm{

	@NotEmpty(message = "please enter full name")
	private String fullName;
	
	@NotEmpty(message = "please enter user name")
	private String userName;
	
	@NotEmpty(message = "please enter password")
	private String password;
	
	@NotNull
	private Date birthDate;
	
	@NotEmpty(message = "please enter contact number")
	private String contactNumber;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	@Override
	public BaseDTO getDto() {

		EmployeeDTO dto = initDTO(new EmployeeDTO());
		dto.setFullName(fullName);
		dto.setUserName(userName);
		dto.setPassword(password);
		dto.setBirthDate(birthDate);
		dto.setContactNumber(contactNumber);
		return dto;
	}

}
