package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.EmployeeDTO;

@Repository
public class EmployeeDAOImpl extends BaseDAOImpl<EmployeeDTO> implements EmployeeDAOInt {

	@Override
	protected List<Predicate> getWhereClause(EmployeeDTO dto, CriteriaBuilder builder, Root<EmployeeDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getFullName())) {
			whereCondition.add(builder.like(qRoot.get("fullName"), dto.getFullName() + "%"));
		}

		if (!isEmptyString(dto.getUserName())) {
			whereCondition.add(builder.like(qRoot.get("userName"), dto.getUserName() + "%"));
		}
		if (!isEmptyString(dto.getPassword())) {
			whereCondition.add(builder.like(qRoot.get("password"), dto.getPassword()));
		}
		if (isNotNull(dto.getBirthDate())) {

			whereCondition.add(builder.equal(qRoot.get("birthDate"), dto.getBirthDate()));
		}
		if (!isEmptyString(dto.getContactNumber())) {
			whereCondition.add(builder.like(qRoot.get("contactNumber"), dto.getContactNumber() + "%"));
		}
		return whereCondition;
	}

	@Override
	public Class<EmployeeDTO> getDTOClass() {
		return EmployeeDTO.class;
	}

}
