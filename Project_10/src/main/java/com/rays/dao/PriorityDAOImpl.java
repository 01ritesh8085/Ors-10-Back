package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.PriorityDTO;

@Repository
public class PriorityDAOImpl extends BaseDAOImpl<PriorityDTO> implements PriorityDAOInt{

	@Override
	protected List<Predicate> getWhereClause(PriorityDTO dto, CriteriaBuilder builder, Root<PriorityDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getPriorityCode())) {
			whereCondition.add(builder.like(qRoot.get("priorityCode"), dto.getPriorityCode() + "%"));
		}
		
		if (!isEmptyString(dto.getPriorityLevel())) {
			whereCondition.add(builder.like(qRoot.get("priorityLevel"), dto.getPriorityLevel() + "%"));
		}
		return whereCondition;
	}

	@Override
	public Class<PriorityDTO> getDTOClass() {
		return PriorityDTO.class;
	}

}
