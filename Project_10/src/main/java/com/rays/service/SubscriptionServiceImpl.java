package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.SubscriptionDAOInt;
import com.rays.dto.SubscriptionDTO;

@Service
@Transactional
public class SubscriptionServiceImpl extends BaseServiceImpl<SubscriptionDTO, SubscriptionDAOInt> implements SubscriptionServiceInt{

}
