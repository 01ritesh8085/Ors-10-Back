package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_SUPPLIER")
public class SupplierDTO extends BaseDTO{

	@Column(name = "NAME", length = 50)
	private String name;
	
	@Column(name = "CATEGORY", length = 50)
	private String category;
	
	@Column(name = "DOB")
	private Date dob;
	
	@Column(name = "PAYMANT_TERM")
	private Long paymantTerm;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Long getPaymantTerm() {
		return paymantTerm;
	}

	public void setPaymantTerm(Long paymantTerm) {
		this.paymantTerm = paymantTerm;
	}

	@Override
	public String getValue() {
		return name;
	}

	@Override
	public String getUniqueKey() {
		return "name";
	}

	@Override
	public String getUniqueValue() {
		return name;
	}

	@Override
	public String getLabel() {
		return "Supplier";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("name", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("name", name);
		return map;
	}
	
}
