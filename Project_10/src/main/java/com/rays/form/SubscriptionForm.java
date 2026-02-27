package com.rays.form;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.SubscriptionDTO;

public class SubscriptionForm extends BaseForm{

	@NotEmpty(message = "please enter plan name")
	private String planName;
	
	@NotNull(message = "please enter plan price")
	private Long planPrice;
	
	@NotNull(message = "please enter start date")
	private LocalDate startDate;
	
	@NotNull(message = "please enter end date")
	private LocalDate endDate;
	
	@NotEmpty(message = "please enter subscription status")
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
	public BaseDTO getDto() {

		SubscriptionDTO dto = initDTO(new SubscriptionDTO());
		dto.setPlanName(planName);
		dto.setPlanPrice(planPrice);
		dto.setStartDate(startDate);
		dto.setEndDate(endDate);
		dto.setSubscriptionStatus(subscriptionStatus);
		return dto;
	}
}