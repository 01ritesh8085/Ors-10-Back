package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_PARKING")
public class ParkingDTO extends BaseDTO {

	@Column(name = "LOCATION", length = 100)
	private String location;

	@Column(name = "CAPACITY")
	private Integer capacity;

	@Column(name = "FEE")
	private Double fee;

	// Getter Setter

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}

	// BaseDTO methods

	@Override
	public String getValue() {
		return location;
	}

	@Override
	public String getUniqueKey() {
		return "location";
	}

	@Override
	public String getUniqueValue() {
		return location;
	}

	@Override
	public String getLabel() {
		return "Parking";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		map.put("location", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<>();
		map.put("location", location);
		return map;
	}
}