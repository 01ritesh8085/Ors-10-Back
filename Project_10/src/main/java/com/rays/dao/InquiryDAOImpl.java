package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.InquiryDTO;

@Repository
public class InquiryDAOImpl extends BaseDAOImpl<InquiryDTO> implements InquiryDAOInt{

	@Override
	protected List<Predicate> getWhereClause(InquiryDTO dto, CriteriaBuilder builder, Root<InquiryDTO> qRoot) {
	
		// Create where conditions
				List<Predicate> whereCondition = new ArrayList<Predicate>();

				if (!isEmptyString(dto.getInquiryName())) {
					whereCondition.add(builder.like(qRoot.get("inquiryName"), dto.getInquiryName() + "%"));
				}
				
				if (!isEmptyString(dto.getEmail())) {
					whereCondition.add(builder.equal(qRoot.get("email"), dto.getEmail()));
				}
				
				if (!isEmptyString(dto.getInquirySubject())) {
					whereCondition.add(builder.like(qRoot.get("inquirySubject"), dto.getInquirySubject() + "%"));
				}
				
				if (!isEmptyString(dto.getInquiryStatus())) {
					whereCondition.add(builder.like(qRoot.get("inquiryStatus"), dto.getInquiryStatus() + "%"));
				}
				return whereCondition;
	}

	@Override
	public Class<InquiryDTO> getDTOClass() {
		return InquiryDTO.class;
	}

}
