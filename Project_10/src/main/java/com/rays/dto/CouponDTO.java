package com.rays.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_COUPON")
public class CouponDTO extends BaseDTO{

	@Column(name = "OFFER_CODE", length = 50)
	private String offerCode;
	
	@Column(name = "DISCOUNT_AMOUNT")
	private BigDecimal discountAmount;
	
	@Column(name = "EXPIRY_DATE")
	private Date expiryDate;
	
	@Column(name = "OFFER_STATUS", length = 50)
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
	public String getValue() {
		return "offerCode";
	}

	@Override
	public String getUniqueKey() {
		return "offerCode";
	}

	@Override
	public String getUniqueValue() {
		return offerCode;
	}

	@Override
	public String getLabel() {
		return "Coupon";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("offerStatus", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("offerCode", offerCode);
		return map;
	}	
}