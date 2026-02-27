package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_REVIEW")
public class ReviewDTO extends BaseDTO {

	@Column(name = "REVIEW_NAME", length = 50)
	private String reviewName;

	@Column(name = "RETING")
	private Long rating;

	@Column(name = "REVIEW_TEXT", length = 100)
	private String reviewText;

	@Column(name = "REVIEW_DATE")
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
	public String getValue() {
		return reviewName;
	}

	@Override
	public String getUniqueKey() {
		return "reviewName";
	}

	@Override
	public String getUniqueValue() {
		return reviewName;
	}

	@Override
	public String getLabel() {
		return "Review";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("reviewName", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("reviewName", reviewName);
		return map;
	}

}