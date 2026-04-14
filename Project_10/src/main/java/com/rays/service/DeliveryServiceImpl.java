package com.rays.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.DeliveryDAOInt;
import com.rays.dao.EnrollmentDAOInt;
import com.rays.dto.DeliveryDTO;
import com.rays.dto.EnrollmentDTO;

@Service
@Transactional
public class DeliveryServiceImpl extends BaseServiceImpl<DeliveryDTO, DeliveryDAOInt> implements DeliveryServiceInt {
	@Autowired
	DeliveryDAOInt deliveryDAOInt;

}