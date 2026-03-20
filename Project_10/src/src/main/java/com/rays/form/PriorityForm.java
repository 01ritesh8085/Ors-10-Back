package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.PriorityDTO;
import com.rays.dto.UserDTO;

public class PriorityForm extends BaseForm{

	@NotEmpty(message = "please enter priorityCode")
	private String priorityCode;

	@NotEmpty(message = "please enter priorityLevel")
	private String priorityLevel;

	@NotEmpty(message = "please enter colorTag")
	private String colorTag;

	@NotEmpty(message = "please enter priorityStatus")
	private String priorityStatus;

	public String getPriorityCode() {
		return priorityCode;
	}

	public void setPriorityCode(String priorityCode) {
		this.priorityCode = priorityCode;
	}

	public String getPriorityLevel() {
		return priorityLevel;
	}

	public void setPriorityLevel(String priorityLevel) {
		this.priorityLevel = priorityLevel;
	}

	public String getColorTag() {
		return colorTag;
	}

	public void setColorTag(String colorTag) {
		this.colorTag = colorTag;
	}

	public String getPriorityStatus() {
		return priorityStatus;
	}

	public void setPriorityStatus(String priorityStatus) {
		this.priorityStatus = priorityStatus;
	}
	
	@Override
	public BaseDTO getDto() {

		PriorityDTO dto = initDTO(new PriorityDTO());
		dto.setPriorityCode(priorityCode);
		dto.setPriorityLevel(priorityLevel);
		dto.setColorTag(colorTag);
		dto.setPriorityStatus(priorityStatus);
		return dto;
	}
}
