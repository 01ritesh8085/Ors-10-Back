package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.JobDTO;

public class JobForm extends BaseForm{

	@NotEmpty(message = "please enter title")
	private String title;

	@NotNull(message = "please enter dob")
	private Date dob;

	@NotEmpty(message = "please enter experience")
	private String experience;

	@NotEmpty(message = "please enter status")
	private String status;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public BaseDTO getDto() {

		JobDTO dto = initDTO(new JobDTO());
		dto.setTitle(title);
		dto.setDob(dob);
		dto.setExperience(experience);
		dto.setStatus(status);
		return dto;
	}
}
