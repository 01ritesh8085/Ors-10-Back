package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.PlacementDTO;

public class PlacementForm extends BaseForm {

	@NotEmpty(message = "please enter placementc ode")
	private String placementCode;

	@NotEmpty(message = "please enter student name")
	private String studentName;

	@NotEmpty(message = "please enter company name")
	private String companyName;

	@NotEmpty(message = "please enter placement status")
	private String placementStatus;

	public String getPlacementCode() {
		return placementCode;
	}

	public void setPlacementCode(String placementCode) {
		this.placementCode = placementCode;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getPlacementStatus() {
		return placementStatus;
	}

	public void setPlacementStatus(String placementStatus) {
		this.placementStatus = placementStatus;
	}

	@Override
	public BaseDTO getDto() {

		PlacementDTO dto = initDTO(new PlacementDTO());
		dto.setPlacementCode(placementCode);
		dto.setStudentName(studentName);
		dto.setCompanyName(companyName);
		dto.setPlacementStatus(placementStatus);
		return dto;
	}
}