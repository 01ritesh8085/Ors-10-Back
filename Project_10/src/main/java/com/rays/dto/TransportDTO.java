package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_TRANSPORT")
public class TransportDTO extends BaseDTO {

	@Column(name = "VEHICLE_NUMBER", length = 50, unique = true)
	private String vehicleNumber;

	@Column(name = "DRIVER_NAME", length = 50)
	private String driverName;

	@Column(name = "VEHICLE_TYPE", length = 50)
	private String vehicleType;

	@Column(name = "TRANSPORT_STATUS", length = 50)
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
	public String getValue() {
		return vehicleNumber;
	}

	@Override
	public String getUniqueKey() {
		return "vehicleNumber";
	}

	@Override
	public String getUniqueValue() {
		return vehicleNumber;
	}

	@Override
	public String getLabel() {
		return "Transport";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("vehicleNumber", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("vehicleNumber", vehicleNumber);
		return map;
	}
}