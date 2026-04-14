package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseForm;
import com.rays.dto.LanguageDTO;

public class LanguageForm extends BaseForm {

	@NotEmpty(message = "Please enter language code")
	private String languageCode;

	@NotEmpty(message = "Please enter language name")
	private String languageName;

	@NotEmpty(message = "Please enter region")
	private String region;

	@NotEmpty(message = "Please select status")
	private String status;

	// Getters & Setters
	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public String getLanguageName() {
		return languageName;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public LanguageDTO getDto() {
		LanguageDTO dto = initDTO(new LanguageDTO());
		dto.setLanguageCode(languageCode);
		dto.setLanguageName(languageName);
		dto.setRegion(region);
		dto.setStatus(status);
		return dto;
	}
}