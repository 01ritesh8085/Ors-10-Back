package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_PRIORITY")
public class PriorityDTO extends BaseDTO{

	@Column(name = "PRIORITY_CODE", length = 50)
	private String priorityCode;
	
	@Column(name = "PRIORITY_LEVEL", length = 50)
	private String priorityLevel;
	
	@Column(name = "COLOR_TAG", length = 50)
	private String colorTag;
	
	@Column(name = "PRIORITY_STATUS", length = 50)
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
	public String getValue() {
		return priorityCode;
	}

	@Override
	public String getUniqueKey() {
		return "priorityCode";
	}

	@Override
	public String getUniqueValue() {
		return priorityCode;
	}

	@Override
	public String getLabel() {
		return "Priority";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("priorityCode", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("priorityCode", priorityCode);
		return map;
	}
}
