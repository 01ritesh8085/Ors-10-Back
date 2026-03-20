package com.rays.dto;

import java.time.LocalDate;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_DELIVERY")
public class DeliveryDTO extends BaseDTO {

	@Column(name = "DELIVERY_CODE", unique = true)
	private String deliveryCode;

	@Column(name = "DELIVERY_ADDRESS", length = 100)
	private String deliveryAddress;

	@Column(name = "DELIVERY_DATE")
	private LocalDate deliveryDate;

	@Column(name = "DELIVERY_STATUS", length = 50)
	private String deliveryStatus;

	// Getter Setter

	public String getDeliveryCode() {
		return deliveryCode;
	}

	public void setDeliveryCode(String deliveryCode) {
		this.deliveryCode = deliveryCode;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	// BaseDTO methods

	@Override
	public String getValue() {
		return deliveryCode;
	}

	@Override
	public String getUniqueKey() {
		return "deliveryCode";
	}

	@Override
	public String getUniqueValue() {
		return deliveryCode;
	}

	@Override
	public String getLabel() {
		return "Delivery";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		map.put("deliveryCode", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<>();
		map.put("deliveryCode", deliveryCode);
		return map;
	}
}