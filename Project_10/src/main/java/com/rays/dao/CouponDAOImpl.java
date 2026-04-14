package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.CouponDTO;

@Repository
public class CouponDAOImpl extends BaseDAOImpl<CouponDTO> implements CouponDAOInt {

	@Override
	protected List<Predicate> getWhereClause(CouponDTO dto, CriteriaBuilder builder, Root<CouponDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getOfferCode())) {
			whereCondition.add(builder.like(qRoot.get("offerCode"), dto.getOfferCode() + "%"));
		}

		if (isNotNull(dto.getExpiryDate())) {
			whereCondition.add(builder.equal(qRoot.get("expiryDate"), dto.getExpiryDate()));
		}

		if (!isEmptyString(dto.getOfferStatus())) {
			whereCondition.add(builder.like(qRoot.get("OfferStatus"), dto.getOfferStatus() + "%"));
		}
		return whereCondition;
	}

	@Override
	public Class<CouponDTO> getDTOClass() {
		return CouponDTO.class;
	}
}