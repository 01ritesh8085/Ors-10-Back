package com.rays.dto;

import java.time.LocalDate;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_PROMOTION")
public class PromotionDTO extends BaseDTO{

	@Column(name = "PROMOTION_CODE", length = 50)
	private String promotionCode;

	@Column(name = "PROMOTION_TITLE", length = 50)
	private String promotionTitle;

	@Column(name = "START_DATE")
	private LocalDate startDate;

	@Column(name = "PROMOTION_STATUS", length = 50)
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
	public String getValue() {
		return promotionCode;
	}

	@Override
	public String getUniqueKey() {
		return "promotionCode";
	}

	@Override
	public String getUniqueValue() {
		return promotionCode;
	}

	@Override
	public String getLabel() {
		return "Promotion";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("promotionCode", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("promotionCode", promotionCode);
		return map;
	}

}
