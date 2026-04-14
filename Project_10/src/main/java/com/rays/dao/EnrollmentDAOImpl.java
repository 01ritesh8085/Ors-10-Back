package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.EnrollmentDTO;

@Repository
public class EnrollmentDAOImpl extends BaseDAOImpl<EnrollmentDTO> implements EnrollmentDAOInt {

	@Override
	protected List<Predicate> getWhereClause(EnrollmentDTO dto, CriteriaBuilder builder, Root<EnrollmentDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<>();

		if (!isEmptyString(dto.getEnrollmentCode())) {
			whereCondition.add(builder.like(qRoot.get("enrollmentCode"), dto.getEnrollmentCode() + "%"));
		}

		if (!isEmptyString(dto.getStudentName())) {
			whereCondition.add(builder.like(qRoot.get("studentName"), dto.getStudentName() + "%"));
		}

		if (!isEmptyString(dto.getEnrollmentStatus())) {
			whereCondition.add(builder.equal(qRoot.get("enrollmentStatus"), dto.getEnrollmentStatus()));
		}

		if (dto.getEnrollmentDate() != null) {
			whereCondition.add(builder.equal(qRoot.get("enrollmentDate"), dto.getEnrollmentDate()));
		}

		return whereCondition;
	}

	@Override
	public Class<EnrollmentDTO> getDTOClass() {
		return EnrollmentDTO.class;
	}
}