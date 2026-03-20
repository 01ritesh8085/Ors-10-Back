package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseForm;
import com.rays.dto.TransportDTO;

public class TransportForm extends BaseForm {

	@NotEmpty(message = "Please enter vehicle number")
	private String vehicleNumber;

	@NotEmpty(message = "Please enter driver name")
	private String driverName;

	@NotEmpty(message = "Please enter vehicle type")
	private String vehicleType;

	@NotEmpty(message = "Please select transport status")
	private String transportStatus;

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getTransportStatus() {
		return transportStatus;
	}

	public void setTransportStatus(String transportStatus) {
		this.transportStatus = transportStatus;
	}

	@Override
	public TransportDTO getDto() {
		TransportDTO dto = initDTO(new TransportDTO());
		dto.setVehicleNumber(vehicleNumber);
		dto.setDriverName(driverName);
		dto.setVehicleType(vehicleType);
		dto.setTransportStatus(transportStatus);
		return dto;
	}
}