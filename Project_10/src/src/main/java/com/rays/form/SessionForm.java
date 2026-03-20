package com.rays.form;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.SessionDTO;


public class SessionForm extends BaseForm{

	@NotEmpty(message = "please enter session name")
	private String sessionName;
	
	@NotNull(message = "please enter start date")
	private LocalDate startDate;
	
	@NotNull(message = "please enter end date")
	private LocalDate endDate;
	
	@NotEmpty(message = "please enter session name")
	private String sessionStatus;

	public String getSessionName() {
		return sessionName;
	}

	public void setSessionName(String sessionName) {
		this.sessionName = sessionName;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public String getSessionStatus() {
		return sessionStatus;
	}

	public void setSessionStatus(String sessionStatus) {
		this.sessionStatus = sessionStatus;
	}
	
	@Override
	public BaseDTO getDto() {

		SessionDTO dto = initDTO(new SessionDTO());
		dto.setSessionName(sessionName);
		dto.setStartDate(startDate);
		dto.setEndDate(endDate);
		dto.setSessionStatus(sessionStatus);
		return dto;
	}
}
