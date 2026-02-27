package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.ReviewDTO;

public class ReviewForm extends BaseForm{

	@NotEmpty(message = "please enter review name")
	private String reviewName;

	@NotNull(message = "please enter rating")
	private Long rating;

	@NotEmpty(message = "please enter review text")
	private String reviewText;

	@NotNull(message = "please enter review date")
	private Date reviewDate;

	public String getReviewName() {
		return reviewName;
	}

	public void setReviewName(String reviewName) {
		this.reviewName = reviewName;
	}

	public Long getRating() {
		return rating;
	}

	public void setRating(Long rating) {
		this.rating = rating;
	}

	public String getReviewText() {
		return reviewText;
	}

	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
	}

	public Date getReviewDate() {
		return reviewDate;
	}

	public void setReviewDate(Date reviewDate) {
		this.reviewDate = reviewDate;
	}

	@Override
	public BaseDTO getDto() {

		ReviewDTO dto = initDTO(new ReviewDTO());
		dto.setReviewName(reviewName);
		dto.setRating(rating);
		dto.setReviewText(reviewText);
		dto.setReviewDate(reviewDate);
		return dto;
	}	
}