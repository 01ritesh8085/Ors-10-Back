package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.SupplierDTO;

@Repository
public class SupplierDAOImpl extends BaseDAOImpl< SupplierDTO> implements SupplierDAOInt{

	@Override
	protected List<Predicate> getWhereClause(SupplierDTO dto, CriteriaBuilder builder, Root<SupplierDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getName())) {
			whereCondition.add(builder.like(qRoot.get("name"), dto.getName() + "%"));
		}
		
		if (!isEmptyString(dto.getCategory())) {
			whereCondition.add(builder.like(qRoot.get("category"), dto.getCategory() + "%"));
		}
		
		if (isNotNull(dto.getDob())) {
			whereCondition.add(builder.equal(qRoot.get("dob"), dto.getDob()));
		}
		return whereCondition;
	}

	@Override
	public Class<SupplierDTO> getDTOClass() {
		return SupplierDTO.class;
	}

}
