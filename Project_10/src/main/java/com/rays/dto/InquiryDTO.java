package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_INQUIRY")
public class InquiryDTO extends BaseDTO {

	@Column(name = "INQUIRY_NAME", length = 50)
	private String inquiryName;

	@Column(name = "EMAIL", length = 50)
	private String email;

	@Column(name = "INQUIRY_SUBJECT", length = 50)
	private String inquirySubject;

	@Column(name = "INQUIRY_STATUS", length = 50)
	private String inquiryStatus;

	public String getInquiryName() {
		return inquiryName;
	}

	public void setInquiryName(String inquiryName) {
		this.inquiryName = inquiryName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getInquirySubject() {
		return inquirySubject;
	}

	public void setInquirySubject(String inquirySubject) {
		this.inquirySubject = inquirySubject;
	}

	public String getInquiryStatus() {
		return inquiryStatus;
	}

	public void setInquiryStatus(String inquiryStatus) {
		this.inquiryStatus = inquiryStatus;
	}

	@Override
	public String getValue() {
		return inquiryName;
	}

	@Override
	public String getUniqueKey() {
		return "inquiryName";
	}

	@Override
	public String getUniqueValue() {
		return "inquiryName";
	}

	@Override
	public String getLabel() {
		return "Inquiry";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("inquiryName", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("email", email);
		return map;
	}

}