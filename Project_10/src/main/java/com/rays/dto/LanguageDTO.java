package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_LANGUAGE")
public class LanguageDTO extends BaseDTO {

	@Column(name = "LANGUAGE_CODE", length = 20)
	private String languageCode;

	@Column(name = "LANGUAGE_NAME", length = 50)
	private String languageName;

	@Column(name = "REGION", length = 50)
	private String region;

	@Column(name = "STATUS", length = 20)
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

	// BaseDTO methods override

	@Override
	public String getValue() {
		return languageName;
	}

	@Override
	public String getUniqueKey() {
		return "languageName";
	}

	@Override
	public String getUniqueValue() {
		return languageName;
	}

	@Override
	public String getLabel() {
		return "Language Name";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		map.put("languageName", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<>();
		map.put("languageName", languageName);
		return map;
	}
}