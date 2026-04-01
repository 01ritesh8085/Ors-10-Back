package com.rays.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.FeedbacakDAOINT;
import com.rays.dto.FeedbackDTO;

@Service
@Transactional
public class FeedbackServiceImpl extends BaseServiceImpl<FeedbackDTO, FeedbacakDAOINT> implements FeedbackServiceInt {

	@Autowired
	FeedbacakDAOINT feedbackDAOInt;

}