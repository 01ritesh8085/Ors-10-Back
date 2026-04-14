package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_COMPLAINT")
public class ComplaintDTO extends BaseDTO {

	@Column(name = "COMPLAINT_TICKET_ID", unique = true)
	private long complaintTicketId;

	@Column(name = "ISSUE_TYPE", length = 50)
	private String issueType;

	@Column(name = "CREATED_DATE")
	private Date createdDate;

	@Column(name = "STATUS", length = 50)
	private String status;

	// Getter Setter

	public long getComplaintTicketId() {
		return complaintTicketId;
	}

	public void setComplaintTicketId(long complaintTicketId) {
		this.complaintTicketId = complaintTicketId;
	}

	public String getIssueType() {
		return issueType;
	}

	public void setIssueType(String issueType) {
		this.issueType = issueType;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	// BaseDTO methods

	@Override
	public String getValue() {
		return String.valueOf(complaintTicketId);
	}

	@Override
	public String getUniqueKey() {
		return "complaintTicketId";
	}

	@Override
	public String getUniqueValue() {
		return String.valueOf(complaintTicketId);
	}

	@Override
	public String getLabel() {
		return "Complaint";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		map.put("complaintTicketId", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<>();
		map.put("complaintTicketId", complaintTicketId);
		return map;
	}
}