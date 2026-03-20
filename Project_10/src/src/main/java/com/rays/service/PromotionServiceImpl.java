package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.PromotionDAOInt;
import com.rays.dto.PromotionDTO;

@Service
@Transactional
public class PromotionServiceImpl extends BaseServiceImpl<PromotionDTO, PromotionDAOInt>
		implements PromotionServiceInt {

}
