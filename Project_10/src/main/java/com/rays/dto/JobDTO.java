package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_JOB")
public class JobDTO extends BaseDTO{

	@Column(name = "TITLE", length = 50)
	private String title;
	
	@Column(name = "DOB")
	private Date dob;
	
	@Column(name = "EXPERIENCE", length = 50)
	private String experience;
	
	@Column(name = "STATUS", length = 50)
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
	public String getValue() {
		return title;
	}

	@Override
	public String getUniqueKey() {
		return "title";
	}

	@Override
	public String getUniqueValue() {
		return title;
	}

	@Override
	public String getLabel() {
		return "Job";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("title", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("title", title);
		return map;
	}
}
