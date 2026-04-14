package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_DEVICE")
public class DeviceDTO extends BaseDTO {

	@Column(name = "DEVICE_SERIAL_NUMBER", length = 50, unique = true)
	private String deviceSerialNumber;

	@Column(name = "DEVICE_NAME", length = 50)
	private String deviceName;

	@Column(name = "DEVICE_TYPE", length = 50)
	private String deviceType;

	@Column(name = "OPERATING_SYSTEM", length = 50)
	private String operatingSystem;

	public String getDeviceSerialNumber() {
		return deviceSerialNumber;
	}

	public void setDeviceSerialNumber(String deviceSerialNumber) {
		this.deviceSerialNumber = deviceSerialNumber;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	@Override
	public String getValue() {
		return deviceName;
	}

	@Override
	public String getUniqueKey() {
		return "deviceName";
	}

	@Override
	public String getUniqueValue() {
		return deviceName;
	}

	@Override
	public String getLabel() {
		return "Device";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("deviceName", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("deviceName", deviceName);
		return map;
	}

}