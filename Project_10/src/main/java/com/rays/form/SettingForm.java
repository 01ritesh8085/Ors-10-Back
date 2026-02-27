package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.SettingDTO;

public class SettingForm extends BaseForm{

	@NotEmpty(message = "please enter setting name")
	private String settingName;
	
	@NotEmpty(message = "please enter setting value")
	private String settingValue;
	
	@NotEmpty(message = "please enter setting type")
	private String settingType;
	
	@NotEmpty(message = "please enter setting status")
	private String settingStatus;

	public String getSettingName() {
		return settingName;
	}

	public void setSettingName(String settingName) {
		this.settingName = settingName;
	}

	public String getSettingValue() {
		return settingValue;
	}

	public void setSettingValue(String settingValue) {
		this.settingValue = settingValue;
	}

	public String getSettingType() {
		return settingType;
	}

	public void setSettingType(String settingType) {
		this.settingType = settingType;
	}

	public String getSettingStatus() {
		return settingStatus;
	}

	public void setSettingStatus(String settingStatus) {
		this.settingStatus = settingStatus;
	}
	
	@Override
	public BaseDTO getDto() {

		SettingDTO dto = initDTO(new SettingDTO());
		dto.setSettingName(settingName);
		dto.setSettingValue(settingValue);
		dto.setSettingType(settingType);
		dto.setSettingStatus(settingStatus);
		return dto;
	}
}
