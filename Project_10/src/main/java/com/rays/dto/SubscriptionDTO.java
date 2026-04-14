package com.rays.dto;

import java.time.LocalDate;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_SUBSCRIPTION")
public class SubscriptionDTO extends BaseDTO{

	@Column(name = "PLAN_NAME", length = 50)
	private String planName;
	
	@Column(name = "PLAN_PRICE")
	private Long planPrice;
	
	@Column(name = "START_DATE")
	private LocalDate startDate;
	
	@Column(name = "END_DATE")
	private LocalDate endDate;
	
	@Column(name = "SUBSCRIPTION_STATUSE", length = 50)
	private String subscriptionStatus;

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public Long getPlanPrice() {
		return planPrice;
	}

	public void setPlanPrice(Long planPrice) {
		this.planPrice = planPrice;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public String getSubscriptionStatus() {
		return subscriptionStatus;
	}

	public void setSubscriptionStatus(String subscriptionStatus) {
		this.subscriptionStatus = subscriptionStatus;
	}

	@Override
	public String getValue() {
		return "startDate";
	}

	@Override
	public String getUniqueKey() {
		return "planName";
	}

	@Override
	public String getUniqueValue() {
		return planName;
	}

	@Override
	public String getLabel() {
		return "Subscription";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("startDate", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("planName", planName);
		return map;
	}

	
}