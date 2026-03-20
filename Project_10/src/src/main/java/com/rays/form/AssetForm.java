package com.rays.form;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.AssetDTO;

public class AssetForm extends BaseForm {

	@NotEmpty(message = "Please Enter assetCode")
	private String assetCode;

	@NotEmpty(message = "Please Enter assetName")
	private String assetName;

	@NotEmpty(message = "Please Enter assignedTo")
	private String assignedTo;

	@NotNull(message = "please enter dob")
	private LocalDate issueDate;

	@NotEmpty(message = "Please Enter assetStatus")
	private String assetStatus;

	public String getAssetCode() {
		return assetCode;
	}

	public void setAssetCode(String assetCode) {
		this.assetCode = assetCode;
	}

	public String getAssetName() {
		return assetName;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	public String getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

	public LocalDate getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}

	public String getAssetStatus() {
		return assetStatus;
	}

	public void setAssetStatus(String assetStatus) {
		this.assetStatus = assetStatus;
	}

	@Override
	public BaseDTO getDto() {

		AssetDTO dto = initDTO(new AssetDTO());
		dto.setAssetCode(assetCode);
		dto.setAssetName(assetName);
		dto.setAssignedTo(assignedTo);
		dto.setIssueDate(issueDate);
		dto.setAssetStatus(assetStatus);
		return dto;
	}
}