package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.FeedbackDTO;

@Repository
public class FeedbackDAOImpl extends BaseDAOImpl<FeedbackDTO> implements FeedbacakDAOINT {

	@Override
	protected List<Predicate> getWhereClause(FeedbackDTO dto, CriteriaBuilder builder, Root<FeedbackDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<>();

		if (dto.getFeedbackFormId() != null && dto.getFeedbackFormId() > 0) {
			whereCondition.add(builder.equal(qRoot.get("feedbackFormId"), dto.getFeedbackFormId()));
		}

		if (!isEmptyString(dto.getParticipantName())) {
			whereCondition.add(builder.like(qRoot.get("participantName"), dto.getParticipantName() + "%"));
		}

		if (dto.getRating() != null) {
			whereCondition.add(builder.equal(qRoot.get("rating"), dto.getRating()));
		}

		if (!isEmptyString(dto.getComments())) {
			whereCondition.add(builder.like(qRoot.get("comments"), dto.getComments() + "%"));
		}

		return whereCondition;
	}

	@Override
	public Class<FeedbackDTO> getDTOClass() {
		return FeedbackDTO.class;
	}
}