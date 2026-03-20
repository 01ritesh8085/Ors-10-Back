package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.TransportDTO;

@Repository
public class TransportDAOImpl extends BaseDAOImpl<TransportDTO> implements TransportDAOInt {

	@Override
	protected List<Predicate> getWhereClause(TransportDTO dto, CriteriaBuilder builder, Root<TransportDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<>();

		if (!isEmptyString(dto.getVehicleNumber())) {
			whereCondition.add(builder.like(qRoot.get("vehicleNumber"), dto.getVehicleNumber() + "%"));
		}

		if (!isEmptyString(dto.getDriverName())) {
			whereCondition.add(builder.like(qRoot.get("driverName"), dto.getDriverName() + "%"));
		}

		if (!isEmptyString(dto.getVehicleType())) {
			whereCondition.add(builder.equal(qRoot.get("vehicleType"), dto.getVehicleType()));
		}

		if (!isEmptyString(dto.getTransportStatus())) {
			whereCondition.add(builder.equal(qRoot.get("transportStatus"), dto.getTransportStatus()));
		}

		return whereCondition;
	}

	@Override
	public Class<TransportDTO> getDTOClass() {
		return TransportDTO.class;
	}
}