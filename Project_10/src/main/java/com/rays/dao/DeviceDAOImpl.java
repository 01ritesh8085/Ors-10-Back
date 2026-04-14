package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.DeviceDTO;

@Repository
public class DeviceDAOImpl extends BaseDAOImpl<DeviceDTO> implements DeviceDAOInt{

	@Override
	protected List<Predicate> getWhereClause(DeviceDTO dto, CriteriaBuilder builder, Root<DeviceDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getDeviceSerialNumber())) {

			whereCondition.add(builder.like(qRoot.get("deviceSerialNumber"), dto.getDeviceSerialNumber() + "%"));
		}
		if (!isEmptyString(dto.getDeviceName())) {

			whereCondition.add(builder.like(qRoot.get("deviceName"), dto.getDeviceName() + "%"));
		}
		
		if (!isEmptyString(dto.getDeviceType())) {

			whereCondition.add(builder.like(qRoot.get("deviceType"), dto.getDeviceType() + "%"));
		}
		if (!isEmptyString(dto.getOperatingSystem())) {

			whereCondition.add(builder.like(qRoot.get("operatingSystem"), dto.getOperatingSystem() + "%"));
		}
		return whereCondition;
	}

	@Override
	public Class<DeviceDTO> getDTOClass() {
		return DeviceDTO.class;
	}

}
