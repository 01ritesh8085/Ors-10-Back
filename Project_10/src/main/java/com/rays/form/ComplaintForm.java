package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseForm;
import com.rays.dto.ComplaintDTO;

public class ComplaintForm extends BaseForm {

	@NotNull(message = "Please enter complaint ticket id")
	private Long complaintTicketId;

	@NotEmpty(message = "Please enter issue type")
	private String issueType;

	@NotNull(message = "Please enter created date")
	private Date createdDate;

	@NotEmpty(message = "Please select status")
	private String status;

	// Getter Setter

	public Long getComplaintTicketId() {
		return complaintTicketId;
	}

	public void setComplaintTicketId(Long complaintTicketId) {
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

	// DTO Mapping

	@Override
	public ComplaintDTO getDto() {
		ComplaintDTO dto = initDTO(new ComplaintDTO());
		dto.setComplaintTicketId(complaintTicketId);
		dto.setIssueType(issueType);
		dto.setCreatedDate(createdDate);
		dto.setStatus(status);
		return dto;
	}
}