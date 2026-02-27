package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.AssetDTO;

@Repository
public class AssetDAOImpl extends BaseDAOImpl<AssetDTO> implements AssetDAOInt{

	@Override
	protected List<Predicate> getWhereClause(AssetDTO dto, CriteriaBuilder builder, Root<AssetDTO> qRoot) {
	
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getAssetName())) {
			whereCondition.add(builder.like(qRoot.get("assetName"), dto.getAssetName() + "%"));
		}
		
		if (!isEmptyString(dto.getAssetStatus())) {
			whereCondition.add(builder.like(qRoot.get("assetStatus"), dto.getAssetStatus() + "%"));
		}
		
		if (isNotNull(dto.getIssueDate())) {
			whereCondition.add(builder.equal(qRoot.get("issueDate"), dto.getIssueDate()));
		}
		return whereCondition;
	}

	@Override
	public Class<AssetDTO> getDTOClass() {
		return AssetDTO.class;
	}

}
