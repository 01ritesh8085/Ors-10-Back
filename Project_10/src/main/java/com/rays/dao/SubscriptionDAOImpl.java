package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.SubscriptionDTO;

@Repository
public class SubscriptionDAOImpl extends BaseDAOImpl<SubscriptionDTO> implements SubscriptionDAOInt {

	@Override
	protected List<Predicate> getWhereClause(SubscriptionDTO dto, CriteriaBuilder builder,Root<SubscriptionDTO> qRoot) {
	
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getPlanName())) {
			whereCondition.add(builder.like(qRoot.get("planName"), dto.getPlanName() + "%"));
		}
		
		if (!isZeroNumber(dto.getPlanPrice())) {
			whereCondition.add(builder.equal(qRoot.get("planPrice"), dto.getPlanPrice()));
		}

		if (isNotNull(dto.getStartDate())) {
			whereCondition.add(builder.equal(qRoot.get("startDate"), dto.getStartDate()));
		}
		
		if (isNotNull(dto.getEndDate())) {
			whereCondition.add(builder.equal(qRoot.get("endDate"), dto.getEndDate()));
		}
		
		if (!isEmptyString(dto.getSubscriptionStatus())) {
			whereCondition.add(builder.equal(qRoot.get("subscriptionStatus"), dto.getSubscriptionStatus()));
		}
		return whereCondition;
	}

	@Override
	public Class<SubscriptionDTO> getDTOClass() {
		return SubscriptionDTO.class;
	}

}
