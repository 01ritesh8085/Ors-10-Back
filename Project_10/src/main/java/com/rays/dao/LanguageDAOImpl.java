package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.LanguageDTO;

@Repository
public class LanguageDAOImpl extends BaseDAOImpl<LanguageDTO> implements LanguageDAOInt {

	@Override
	protected List<Predicate> getWhereClause(LanguageDTO dto, CriteriaBuilder builder, Root<LanguageDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<>();

		if (!isEmptyString(dto.getLanguageCode())) {
			whereCondition.add(builder.like(qRoot.get("languageCode"), dto.getLanguageCode() + "%"));
		}

		if (!isEmptyString(dto.getLanguageName())) {
			whereCondition.add(builder.like(qRoot.get("languageName"), dto.getLanguageName() + "%"));
		}

		if (!isEmptyString(dto.getRegion())) {
			whereCondition.add(builder.equal(qRoot.get("region"), dto.getRegion()));
		}

		if (!isEmptyString(dto.getStatus())) {
			whereCondition.add(builder.equal(qRoot.get("status"), dto.getStatus()));
		}

		return whereCondition;
	}

	@Override
	public Class<LanguageDTO> getDTOClass() {
		return LanguageDTO.class;
	}
}