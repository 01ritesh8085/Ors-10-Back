package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.ReviewDTO;

@Repository
public class ReviewDAOImpl extends BaseDAOImpl<ReviewDTO> implements ReviewDAOInt {

	@Override
	protected List<Predicate> getWhereClause(ReviewDTO dto, CriteriaBuilder builder, Root<ReviewDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getReviewName())) {
			whereCondition.add(builder.like(qRoot.get("reviewName"), dto.getReviewName() + "%"));
		}

		if (!isZeroNumber(dto.getRating())) {
			whereCondition.add(builder.equal(qRoot.get("rating"), dto.getRating()));
		}
		
		if (!isEmptyString(dto.getReviewText())) {
			whereCondition.add(builder.like(qRoot.get("reviewText"), dto.getReviewText() + "%"));
		}
		
		if (isNotNull(dto.getReviewDate())) {
			whereCondition.add(builder.equal(qRoot.get("reviewDate"), dto.getReviewDate()));
		}
		return whereCondition;
	}

	@Override
	public Class<ReviewDTO> getDTOClass() {
		return ReviewDTO.class;
	}

}
