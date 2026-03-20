package com.rays.form;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseForm;
import com.rays.dto.DeliveryDTO;

public class DeliveryForm extends BaseForm {

	@NotEmpty(message = "Please enter delivery code")
	private String deliveryCode;

	@NotEmpty(message = "Please enter delivery address")
	private String deliveryAddress;

	@NotNull(message = "Please enter delivery date")
	private LocalDate deliveryDate;

	@NotEmpty(message = "Please select delivery status")
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

	// DTO Mapping

	@Override
	public DeliveryDTO getDto() {

		DeliveryDTO dto = initDTO(new DeliveryDTO());

		dto.setDeliveryCode(deliveryCode);
		dto.setDeliveryAddress(deliveryAddress);
		dto.setDeliveryDate(deliveryDate);
		dto.setDeliveryStatus(deliveryStatus);

		return dto;
	}
}