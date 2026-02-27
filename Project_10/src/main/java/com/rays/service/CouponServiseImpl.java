package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.CouponDAOInt;
import com.rays.dto.CouponDTO;

@Service
@Transactional
public class CouponServiseImpl extends BaseServiceImpl<CouponDTO, CouponDAOInt> implements CouponServiceInt {

	
}