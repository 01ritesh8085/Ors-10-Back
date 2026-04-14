package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.SettingDTO;

@Repository
public class SettingDAOImpl extends BaseDAOImpl<SettingDTO> implements SettingDAOInt {

	@Override
	protected List<Predicate> getWhereClause(SettingDTO dto, CriteriaBuilder builder, Root<SettingDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getSettingName())) {
			whereCondition.add(builder.like(qRoot.get("settingName"), dto.getSettingName() + "%"));
		}

		if (!isEmptyString(dto.getSettingValue())) {
			whereCondition.add(builder.like(qRoot.get("settingValue"), dto.getSettingValue() + "%"));
		}
		
		if (!isEmptyString(dto.getSettingType())) {
			whereCondition.add(builder.like(qRoot.get("settingType"), dto.getSettingType() + "%"));
		}
		
		if (!isEmptyString(dto.getSettingStatus())) {
			whereCondition.add(builder.like(qRoot.get("settingStatus"), dto.getSettingStatus() + "%"));
		}
		return null;
	}

	@Override
	public Class<SettingDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return SettingDTO.class;
	}

}
