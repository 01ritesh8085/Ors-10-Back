package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseForm;
import com.rays.dto.FeedbackDTO;

public class FeedbackForm extends BaseForm {

	@NotNull(message = "Please enter feedback form id")
	private Long feedbackFormId;

	@NotEmpty(message = "Please enter participant name")
	private String participantName;

	@NotNull(message = "Please enter rating")
	private Integer rating;

	@NotEmpty(message = "Please enter comments")
	private String comments;

	// Getter Setter

	public Long getFeedbackFormId() {
		return feedbackFormId;
	}

	public void setFeedbackFormId(Long feedbackFormId) {
		this.feedbackFormId = feedbackFormId;
	}

	public String getParticipantName() {
		return participantName;
	}

	public void setParticipantName(String participantName) {
		this.participantName = participantName;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	// DTO Mapping

	@Override
	public FeedbackDTO getDto() {
		FeedbackDTO dto = initDTO(new FeedbackDTO());
		dto.setFeedbackFormId(feedbackFormId);
		dto.setParticipantName(participantName);
		dto.setRating(rating);
		dto.setComments(comments);
		return dto;
	}
}