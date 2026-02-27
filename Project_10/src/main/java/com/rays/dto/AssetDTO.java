package com.rays.dto;

import java.time.LocalDate;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_ASSET")
public class AssetDTO extends BaseDTO {

	@Column(name = "ASSET_CODE", length = 50)
	private String assetCode;

	@Column(name = "ASSET_NAME", length = 50)
	private String assetName;

	@Column(name = "ASSIGNED_TO", length = 50)
	private String assignedTo;

	@Column(name = "ISSUE_DATE")
	private LocalDate issueDate;

	@Column(name = "ASSET_STATUS", length = 50)
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
	public String getValue() {
		return assetCode;
	}

	@Override
	public String getUniqueKey() {
		return "assetCode";
	}

	@Override
	public String getUniqueValue() {
		return assetCode;
	}

	@Override
	public String getLabel() {
		return "Asset";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("assetCode", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("assetCode", assetCode);
		return map;
	}
}