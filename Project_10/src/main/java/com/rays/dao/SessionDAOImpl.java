package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.SessionDTO;

@Repository
public class SessionDAOImpl extends BaseDAOImpl<SessionDTO> implements SessionDAOInt{

	@Override
	protected List<Predicate> getWhereClause(SessionDTO dto, CriteriaBuilder builder, Root<SessionDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getSessionName())) {
			whereCondition.add(builder.like(qRoot.get("sessionName"), dto.getSessionName() + "%"));
		}
		
		if (isNotNull(dto.getStartDate())) {
			whereCondition.add(builder.equal(qRoot.get("startDate"), dto.getStartDate()));
		}
		
		if (isNotNull(dto.getEndDate())) {
			whereCondition.add(builder.equal(qRoot.get("endDate"), dto.getEndDate()));
		}
		
		if (!isEmptyString(dto.getSessionStatus())) {
			whereCondition.add(builder.equal(qRoot.get("sessionStatus"), dto.getSessionStatus()));
		}
		return whereCondition;
	}
	
	@Override
	public Class<SessionDTO> getDTOClass() {
		return SessionDTO.class;
	}

}
