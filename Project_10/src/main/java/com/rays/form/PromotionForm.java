package com.rays.form;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.PromotionDTO;


public class PromotionForm extends BaseForm{

	@NotEmpty(message = "please enter promotion code")
	private String promotionCode;

	@NotEmpty(message = "please enter promotion title")
	private String promotionTitle;

	@NotNull(message = "please enter start date")
	private LocalDate startDate;

	@NotEmpty(message = "please enter promotion status")
	private String promotionStatus;

	public String getPromotionCode() {
		return promotionCode;
	}

	public void setPromotionCode(String promotionCode) {
		this.promotionCode = promotionCode;
	}

	public String getPromotionTitle() {
		return promotionTitle;
	}

	public void setPromotionTitle(String promotionTitle) {
		this.promotionTitle = promotionTitle;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public String getPromotionStatus() {
		return promotionStatus;
	}

	public void setPromotionStatus(String promotionStatus) {
		this.promotionStatus = promotionStatus;
	}
	
	@Override
	public BaseDTO getDto() {

		PromotionDTO dto = initDTO(new PromotionDTO());
		dto.setPromotionCode(promotionCode);
		dto.setPromotionTitle(promotionTitle);
		dto.setStartDate(startDate);
		dto.setPromotionStatus(promotionStatus);
		return dto;
	}
}
