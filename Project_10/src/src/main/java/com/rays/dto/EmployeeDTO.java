package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_EMPLOYEE")
public class EmployeeDTO extends BaseDTO {

	@Column(name = "FULL_NAME", length = 50)
	private String fullName;

	@Column(name = "USER_NAME", length = 50)
	private String userName;

	@Column(name = "PASSWORD", length = 50)
	private String password;

	@Column(name = "BIRTH_DATE")
	private Date birthDate;

	@Column(name = "CONTACT_NUMBER", length = 50)
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
	public String getValue() {
		return fullName;
	}

	@Override
	public String getUniqueKey() {
		return "fullName";
	}

	@Override
	public String getUniqueValue() {
		return "fullName";
	}

	@Override
	public String getLabel() {
		return "Full Name";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("fullName", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("fullName", fullName);
		return map;
	}
}
