package com.rays.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.BankDAOInt;
import com.rays.dao.TransportDAOInt;
import com.rays.dto.TransportDTO;

import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.AssetDAOInt;
import com.rays.dto.AssetDTO;

@Service
@Transactional

public class TransportServiceImpl extends BaseServiceImpl<TransportDTO, TransportDAOInt>
		implements TransportServiceInt {

	@Autowired
	TransportDAOInt tranportDAOInt;

}
