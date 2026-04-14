package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.DeliveryDTO;

@Repository
public class DeliveryDAOImpl extends BaseDAOImpl<DeliveryDTO> implements DeliveryDAOInt {

	@Override
	protected List<Predicate> getWhereClause(DeliveryDTO dto, CriteriaBuilder builder, Root<DeliveryDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<>();

		if (!isEmptyString(dto.getDeliveryCode())) {
			whereCondition.add(builder.like(qRoot.get("deliveryCode"), dto.getDeliveryCode() + "%"));
		}

		if (!isEmptyString(dto.getDeliveryAddress())) {
			whereCondition.add(builder.like(qRoot.get("deliveryAddress"), dto.getDeliveryAddress() + "%"));
		}

		if (!isEmptyString(dto.getDeliveryStatus())) {
			whereCondition.add(builder.equal(qRoot.get("deliveryStatus"), dto.getDeliveryStatus()));
		}

		if (dto.getDeliveryDate() != null) {
			whereCondition.add(builder.equal(qRoot.get("deliveryDate"), dto.getDeliveryDate()));
		}

		return whereCondition;
	}

	@Override
	public Class<DeliveryDTO> getDTOClass() {
		return DeliveryDTO.class;
	}
}