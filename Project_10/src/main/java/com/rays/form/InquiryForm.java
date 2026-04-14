package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.InquiryDTO;

public class InquiryForm extends BaseForm {

	@NotEmpty(message = "please enter inquiry name")
	private String inquiryName;

	@NotEmpty(message = "please enter email")
	private String email;

	@NotEmpty(message = "please enter inquiry subject")
	private String inquirySubject;

	@NotEmpty(message = "please enter inquiry status")
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
	public BaseDTO getDto() {

		InquiryDTO dto = initDTO(new InquiryDTO());
		dto.setInquiryName(inquiryName);
		dto.setEmail(email);
		dto.setInquirySubject(inquirySubject);
		dto.setInquiryStatus(inquiryStatus);
		return dto;
	}
}