package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.PromotionDTO;

@Repository
public class PromotionDAOImpl extends BaseDAOImpl<PromotionDTO> implements PromotionDAOInt{

	@Override
	protected List<Predicate> getWhereClause(PromotionDTO dto, CriteriaBuilder builder, Root<PromotionDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getPromotionCode())) {
			whereCondition.add(builder.like(qRoot.get("promotionCode"), dto.getPromotionCode() + "%"));
		}
		
		if (!isEmptyString(dto.getPromotionStatus())) {
			whereCondition.add(builder.like(qRoot.get("promotionStatus"), dto.getPromotionStatus() + "%"));
		}
		
		if (isNotNull(dto.getStartDate())) {
			whereCondition.add(builder.equal(qRoot.get("startDate"), dto.getStartDate()));
		}
		return whereCondition;
	
	}

	@Override
	public Class<PromotionDTO> getDTOClass() {
		return PromotionDTO.class;
	}

}
