package com.rays.form;

import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.CouponDTO;

public class CouponForm extends BaseForm{

	@NotEmpty(message = "please enter offer code")
	private String offerCode;
	
	@NotNull(message = "please enter discount amount")
	private BigDecimal discountAmount;
	
	@NotNull(message = "please enter expiry date")
	private Date expiryDate;
	
	@NotEmpty(message = "please enter offer status")
	private String offerStatus;

	public String getOfferCode() {
		return offerCode;
	}

	public void setOfferCode(String offerCode) {
		this.offerCode = offerCode;
	}

	public BigDecimal getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(BigDecimal discountAmount) {
		this.discountAmount = discountAmount;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getOfferStatus() {
		return offerStatus;
	}

	public void setOfferStatus(String offerStatus) {
		this.offerStatus = offerStatus;
	}
	
	@Override
	public BaseDTO getDto() {

		CouponDTO dto = initDTO(new CouponDTO());

		dto.setOfferCode(offerCode);
		dto.setDiscountAmount(discountAmount);
		dto.setExpiryDate(expiryDate);
		dto.setOfferStatus(offerStatus);
		
		return dto;
	}
}