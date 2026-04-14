package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.ParkingDTO;

public class ParkingForm extends BaseForm {

	@NotEmpty(message = "Please Enter location")
	private String location;

	@NotNull(message = "Please Enter capacity")
	private Integer capacity;

	@NotNull(message = "Please Enter fee")
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

	@Override
	public BaseDTO getDto() {

		ParkingDTO dto = initDTO(new ParkingDTO());

		dto.setLocation(location);
		dto.setCapacity(capacity);
		dto.setFee(fee);

		return dto;
	}
}